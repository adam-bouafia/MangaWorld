package it.univaq.sose.mangastorecatalogservice.controller;

import it.univaq.sose.mangastorecatalogservice.service.ProductService;
import it.univaq.sose.mangastorecatalogservice.web.CreateProductRequest;
import it.univaq.sose.mangastorecatalogservice.web.ProductResponse;
import it.univaq.sose.mangastorecatalogservice.web.ProductsPagedResponse;
import it.univaq.sose.mangastorecatalogservice.web.UpdateProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

/**
 * Controller class for managing products.
 */
@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * Endpoint for creating a new product.
     *
     * @param createProductRequest The request object containing the details of the product to be created.
     * @return A ResponseEntity with the HTTP status code and the URI of the created product.
     */
    @PostMapping("/product")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public ResponseEntity<?> createProduct(@RequestBody @Valid CreateProductRequest createProductRequest){

        String product = productService.createProduct(createProductRequest);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{productId}")
                .buildAndExpand(product).toUri();

        return ResponseEntity.created(location).build();
    }

    /**
     * Endpoint for retrieving a product by its ID.
     *
     * @param productId The ID of the product to retrieve.
     * @return A ResponseEntity with the HTTP status code and the retrieved product.
     */
    @GetMapping("/product/{productId}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable("productId") String productId) {

        ProductResponse product = productService.getProduct(productId);

        return ResponseEntity.ok(product);
    }

    /**
     * Endpoint for deleting a product by its ID.
     *
     * @param productId The ID of the product to delete.
     * @return A ResponseEntity with the HTTP status code.
     */
    @DeleteMapping("/product/{productId}")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public ResponseEntity<?> deleteProductCategory(@PathVariable("productId") String productId) {

        productService.deleteProduct(productId);

        return ResponseEntity.noContent().build();
    }

    /**
     * Endpoint for updating a product.
     *
     * @param updateProductRequest The request object containing the updated details of the product.
     * @return A ResponseEntity with the HTTP status code.
     */
    @PutMapping("/product")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public ResponseEntity<?> updateProduct(@RequestBody @Valid UpdateProductRequest updateProductRequest) {

        productService.updateProduct(updateProductRequest);

        return ResponseEntity.noContent().build();
    }

    /**
     * Endpoint for retrieving all products.
     *
     * @param sort The sorting criteria for the products (optional).
     * @param page The page number for pagination (optional).
     * @param size The number of products per page for pagination (optional).
     * @param assembler The PagedResourcesAssembler for creating the paged response.
     * @return A ResponseEntity with the HTTP status code and the paged response of products.
     */
    @GetMapping(value = "/products", produces = "application/json")
    public ResponseEntity<?> getAllProducts(@RequestParam(value = "sort", required = false) String sort,
                                            @RequestParam(value = "page", required = false) Integer page,
                                            @RequestParam(value = "size", required = false) Integer size,
                                            PagedResourcesAssembler<ProductResponse> assembler) {

        Page<ProductResponse> list = productService.getAllProducts(sort, page, size);

        Link link = new Link(ServletUriComponentsBuilder.fromCurrentRequest().build()
                                                        .toUriString());

        PagedModel<EntityModel<ProductResponse>> resource = assembler.toModel(list, link);

        ProductsPagedResponse productsPagedResponse = new ProductsPagedResponse();
        productsPagedResponse.setPage(list);

        if (resource.getLink("first").isPresent()) {
            productsPagedResponse.get_links().put("first", resource.getLink("first").get().getHref());
        }

        if (resource.getLink("prev").isPresent()) {
            productsPagedResponse.get_links().put("prev", resource.getLink("prev").get().getHref());
        }

        if (resource.getLink("self").isPresent()) {
            productsPagedResponse.get_links().put("self", resource.getLink("self").get().getHref());
        }

        if (resource.getLink("next").isPresent()) {
            productsPagedResponse.get_links().put("next", resource.getLink("next").get().getHref());
        }

        if (resource.getLink("last").isPresent()) {
            productsPagedResponse.get_links().put("last", resource.getLink("last").get().getHref());
        }

        return ResponseEntity.ok(productsPagedResponse);

    }
}
