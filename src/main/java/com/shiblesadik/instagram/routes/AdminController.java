package com.shiblesadik.instagram.routes;

import com.shiblesadik.instagram.models.Admin;
import com.shiblesadik.instagram.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/all")
    public List<Admin> getAll() {
        List<Admin> allAdmin = adminRepository.findAll();
        return allAdmin;
    }
}
