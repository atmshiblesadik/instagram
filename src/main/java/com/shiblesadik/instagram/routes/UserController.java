package com.shiblesadik.instagram.routes;

import com.shiblesadik.instagram.models.User;
import com.shiblesadik.instagram.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        List<User> allUser = repository.findAll();
        return allUser;
    }

    @PostMapping("/insert")
    public String insertUser(@RequestBody User user) {
        repository.save(user);
        return "Successfully: " + user.getId();
    }

    @GetMapping("/{userId}")
    public Optional<User> getSingleUser(@PathVariable String userId) {
        return repository.findById(userId);
    }

    @GetMapping("/delete/{userId}")
    public String deleteUser(@PathVariable String userId) {
        repository.deleteById(userId);
        return "Successfully " + userId + " deleted";
    }
}
