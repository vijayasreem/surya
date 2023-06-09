package com.surendradvpp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseSpringBootProjectRepository extends JpaRepository<String, Long> {
 
    // Method to create a new Spring Boot project using Maven as a build tool
    String createSpringBootProjectUsingMaven();
 
    // Method to manage dependencies and build the project without manually configuring the project structure
    String manageDependenciesAndBuildProject();
}