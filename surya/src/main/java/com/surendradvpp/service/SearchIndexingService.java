package com.surendradvpp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surendradvpp.repository.SearchIndexingRepository;
import com.surendradvpp.model.Product;

@Service
public class SearchIndexingService {
    @Autowired
    private SearchIndexingRepository searchIndexingRepository;

    public Product findByName(String name) {
        return searchIndexingRepository.findByName(name);
    }

    public List<Product> findByNameContainingIgnoreCase(String name) {
        return searchIndexingRepository.findByNameContainingIgnoreCase(name);
    }

    public List<Product> findByDescriptionContainingIgnoreCase(String description) {
        return searchIndexingRepository.findByDescriptionContainingIgnoreCase(description);
    }

    public List<Product> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String name, String description) {
        return searchIndexingRepository.findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(name, description);
    }

    public void deleteByName(String name) {
        searchIndexingRepository.deleteByName(name);
    }

    public void deleteAll() {
        searchIndexingRepository.deleteAll();
    }
}