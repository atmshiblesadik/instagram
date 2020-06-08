package com.shiblesadik.instagram.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class ImageUploadServices {

    public void uploadFile(MultipartFile file) throws IOException {
        file.transferTo(new File("D:\\SpringBoot\\Instagram\\" + file.getOriginalFilename()));
    }

    public void uploadFileToDatabase(MultipartFile file) throws IOException {
        file.transferTo(new File("D:\\SpringBoot\\Instagram\\" + "newFile" + file.getOriginalFilename()));
    }

    public void uploadFileToDatabaseTesting(MultipartFile file) throws IOException {
        file.transferTo(new File("D:\\SpringBoot\\Instagram\\" + "newFile" + file.getOriginalFilename()));
    }
    public void uploadFileToDatabaseTesting2(MultipartFile file) throws IOException {
        file.transferTo(new File("D:\\SpringBoot\\Instagram\\" + "newFile" + file.getOriginalFilename()));
    }
}
