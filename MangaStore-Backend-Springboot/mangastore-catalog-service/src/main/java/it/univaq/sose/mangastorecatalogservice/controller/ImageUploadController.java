package it.univaq.sose.mangastorecatalogservice.controller;

import it.univaq.sose.mangastorecommons.exception.RunTimeExceptionPlaceHolder;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
/*
    Lot of improvement s can be done in image upload section.
    We can use AWS s3 to store data instead of this.
    For time being will go with no-cost implementation.
 */
@RestController
public class ImageUploadController {

    @PostMapping("image/upload")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public ResponseEntity<?> uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
        if (file == null) {
            throw new RunTimeExceptionPlaceHolder("Invalid Image!!");
        }
        UUID uuid = UUID.randomUUID();
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Files.createDirectories(Paths.get("data"));
        Path path = Paths.get("data/" + uuid.toString() + "__" + fileName);
        Path absolutePath = path.toAbsolutePath();
        try {
            Files.copy(file.getInputStream(), absolutePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, String> response = new HashMap<>();
        response.put("imageId", uuid.toString() + "__" + fileName);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping(path = "image/{imageId}")
    public ResponseEntity<?> getImage(@PathVariable String imageId) throws IOException {
        Optional<Path> data = Files.list(Paths.get("data")).filter(img -> img.getFileName().toString().equals(imageId)).findFirst();
        if (data.isPresent()) {
            final ByteArrayResource inputStream = new ByteArrayResource(Files.readAllBytes(data.get()));
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .contentType(MediaType.IMAGE_JPEG)
                    .contentLength(inputStream.contentLength())
                    .body(inputStream);
        }
        return ResponseEntity.ok().build();
    }
}
