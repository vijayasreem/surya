package com.surendradvpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surendradvpp.model.Product;
import com.surendradvpp.model.User;
import com.surendradvpp.service.SearchIndexingService;
import com.surendradvpp.service.PasswordEncryptionService;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    SearchIndexingService searchIndexingService;
    
    @Autowired
    PasswordEncryptionService passwordEncryptionService;

    @GetMapping("/product/name/{name}")
    public Product getProductByName(@PathVariable String name) {
        return searchIndexingService.findByName(name);
    }

    @GetMapping("/product/name/contains/{name}")
    public List<Product> getProductByNameContainingIgnoreCase(@PathVariable String name) {
        return searchIndexingService.findByNameContainingIgnoreCase(name);
    }

    @GetMapping("/product/description/contains/{description}")
    public List<Product> getProductByDescriptionContainingIgnoreCase(@PathVariable String description) {
        return searchIndexingService.findByDescriptionContainingIgnoreCase(description);
    }

    @GetMapping("/product/name/contains/or/description/contains/{name}/{description}")
    public List<Product> getProductByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(@PathVariable String name, @PathVariable String description) {
        return searchIndexingService.findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(name, description);
    }

    @DeleteMapping("/product/name/{name}")
    public void deleteProductByName(@PathVariable String name) {
        searchIndexingService.deleteByName(name);
    }

    @DeleteMapping("/product/all")
    public void deleteAllProducts() {
        searchIndexingService.deleteAll();
    }

    @GetMapping("/user/username/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return passwordEncryptionService.findByUsername(username);
    }

    @PutMapping("/user/encryptPassword")
    public String encryptPassword(@RequestBody String password) {
        return passwordEncryptionService.encryptPassword(password);
    }

    @PostMapping("/user/comparePasswords")
    public boolean comparePasswords(@RequestBody String password, @RequestBody String storedEncryptedPassword) {
        return passwordEncryptionService.comparePasswords(password, storedEncryptedPassword);
    }
}