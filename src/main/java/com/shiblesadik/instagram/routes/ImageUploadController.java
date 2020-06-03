package com.shiblesadik.instagram.routes;

import com.shiblesadik.instagram.service.ImageUploadServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/image")
public class ImageUploadController {

    @Autowired
    ImageUploadServices imageUploadServices;

    @PostMapping("/upload")
    public String imageUpload(@RequestParam("file") MultipartFile file) throws IOException {
        imageUploadServices.uploadFile(file);
        return "File Uploaded";
    }
}
