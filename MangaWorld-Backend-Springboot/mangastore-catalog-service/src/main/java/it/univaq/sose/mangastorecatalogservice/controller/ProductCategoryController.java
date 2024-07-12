package it.univaq.sose.mangastorecatalogservice.controller;

import it.univaq.sose.mangastorecatalogservice.repository.dao.ProductCategory;
import it.univaq.sose.mangastorecatalogservice.service.ProductCategoryService;
import it.univaq.sose.mangastorecatalogservice.web.CreateProductCategoryRequest;
import it.univaq.sose.mangastorecatalogservice.web.ProductCategoriesPagedResponse;
import it.univaq.sose.mangastorecatalogservice.web.UpdateProductCategoryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
 * Controller class for managing product categories.
 */
@RestController
public class ProductCategoryController {

    @Autowired
    ProductCategoryService productCategoryService;

    /**
     * Endpoint for creating a new product category.
     *
     * @param createProductCategoryRequest The request object containing the details of the product category to be created.
     * @return A ResponseEntity with the HTTP status code and the location of the created resource.
     */
    @PostMapping("/productCategory")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public ResponseEntity<?> createProductCategory(@RequestBody @Valid CreateProductCategoryRequest createProductCategoryRequest) {

        String productCategory = productCategoryService.createProductCategory(createProductCategoryRequest);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{productCategoryId}")
                .buildAndExpand(productCategory).toUri();

        return ResponseEntity.created(location).build();
    }

    /**
     * Endpoint for retrieving a product category by its ID.
     *
     * @param productCategoryId The ID of the product category to retrieve.
     * @return A ResponseEntity with the HTTP status code and the retrieved product category.
     */
    @GetMapping("/productCategory/{productCategoryId}")
    public ResponseEntity<ProductCategory> getProductCategory(@PathVariable("productCategoryId") String productCategoryId) {

        ProductCategory productCategory = productCategoryService.getProductCategory(productCategoryId);

        return ResponseEntity.ok(productCategory);
    }

    /**
     * Endpoint for deleting a product category by its ID.
     *
     * @param productCategoryId The ID of the product category to delete.
     * @return A ResponseEntity with the HTTP status code.
     */
    @DeleteMapping("/productCategory/{productCategoryId}")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public ResponseEntity<?> deleteProductCategory(@PathVariable("productCategoryId") String productCategoryId) {

        productCategoryService.deleteProductCategory(productCategoryId);

        return ResponseEntity.noContent().build();
    }

    /**
     * Endpoint for updating a product category.
     *
     * @param updateProductCategoryRequest The request object containing the updated details of the product category.
     * @return A ResponseEntity with the HTTP status code.
     */
    @PutMapping("/productCategory")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public ResponseEntity<?> updateProductCategory(@RequestBody @Valid UpdateProductCategoryRequest updateProductCategoryRequest) {

        productCategoryService.updateProductCategory(updateProductCategoryRequest);

        return ResponseEntity.noContent().build();
    }

    /**
     * Endpoint for retrieving all product categories.
     *
     * @param sort     The sorting criteria for the product categories (optional).
     * @param page     The page number for pagination (optional).
     * @param size     The page size for pagination (optional).
     * @param assembler The PagedResourcesAssembler for creating the response with pagination links.
     * @return A ResponseEntity with the HTTP status code and the paged response of product categories.
     */
    @GetMapping(value = "/productCategories", produces = "application/json")
    public ResponseEntity<?> getAllProductCategories(@RequestParam(value = "sort", required = false) String sort,
                                                     @RequestParam(value = "page", required = false) Integer page,
                                                     @RequestParam(value = "size", required = false) Integer size,
                                                     PagedResourcesAssembler<ProductCategory> assembler) {

        Page<ProductCategory> list = productCategoryService.getAllProductCategories(sort, page, size);

        Link link = new Link(ServletUriComponentsBuilder.fromCurrentRequest()
                .build()
                .toUriString());

        PagedModel<EntityModel<ProductCategory>> resource = assembler.toModel(list, link);

        ProductCategoriesPagedResponse productCategoriesPagedResponse = new ProductCategoriesPagedResponse();
        productCategoriesPagedResponse.setPage(list);

        if (resource.getLink("first").isPresent()) {
            productCategoriesPagedResponse.get_links().put("first", resource.getLink("first").get().getHref());
        }

        if (resource.getLink("prev").isPresent()) {
            productCategoriesPagedResponse.get_links().put("prev", resource.getLink("prev").get().getHref());
        }

        if (resource.getLink("self").isPresent()) {
            productCategoriesPagedResponse.get_links().put("self", resource.getLink("self").get().getHref());
        }

        if (resource.getLink("next").isPresent()) {
            productCategoriesPagedResponse.get_links().put("next", resource.getLink("next").get().getHref());
        }

        if (resource.getLink("last").isPresent()) {
            productCategoriesPagedResponse.get_links().put("last", resource.getLink("last").get().getHref());
        }

        return ResponseEntity.ok(productCategoriesPagedResponse);

    }
}
