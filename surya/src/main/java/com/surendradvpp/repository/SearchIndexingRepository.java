package com.surendradvpp.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchIndexingRepository extends ElasticsearchRepository<Product, String> {
    Product findByName(String name);
    List<Product> findByNameContainingIgnoreCase(String name);
    List<Product> findByDescriptionContainingIgnoreCase(String description);
    List<Product> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String name, String description);
    void deleteByName(String name);
    void deleteAll();
}