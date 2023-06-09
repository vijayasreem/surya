package com.surendradvpp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surendradvpp.repository.BaseSpringBootProjectRepository;

@Service
public class BaseSpringBootProjectService {

  @Autowired
  private BaseSpringBootProjectRepository baseSpringBootProjectRepository;

  // Method to create a new Spring Boot project using Maven as a build tool
  public String createSpringBootProjectUsingMaven() {
    return baseSpringBootProjectRepository.createSpringBootProjectUsingMaven();
  }

  // Method to manage dependencies and build the project without manually configuring the project structure
  public String manageDependenciesAndBuildProject() {
    return baseSpringBootProjectRepository.manageDependenciesAndBuildProject();
  }

}