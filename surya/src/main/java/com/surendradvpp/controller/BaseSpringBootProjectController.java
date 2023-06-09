package com.surendradvpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surendradvpp.model.BaseSpringBootProject;
import com.surendradvpp.model.LambdaFunctionality;
import com.surendradvpp.service.BaseSpringBootProjectService;
import com.surendradvpp.service.LambdaFunctionalityService;

@RestController
@RequestMapping("/api")
public class BaseSpringBootProjectController {

    @Autowired
    private BaseSpringBootProjectService baseSpringBootProjectService;
    
    @Autowired
    private LambdaFunctionalityService lambdaFunctionalityService;

    // Endpoint to create a new Spring Boot project using Maven as a build tool
    @PostMapping("/createSpringBootProjectUsingMaven")
    public String createSpringBootProjectUsingMaven() {
        return baseSpringBootProjectService.createSpringBootProjectUsingMaven();
    }

    // Endpoint to manage dependencies and build the project without manually configuring the project structure
    @PostMapping("/manageDependenciesAndBuildProject")
    public String manageDependenciesAndBuildProject() {
        return baseSpringBootProjectService.manageDependenciesAndBuildProject();
    }

    // Endpoint to incorporate the AWS cloud into the sacral AI application by implementing Lambda functionality
    @PostMapping("/incorporateAWSCloudWithLambdaFunctionality")
    public void incorporateAWSCloudWithLambdaFunctionality() {
        lambdaFunctionalityService.incorporateAWSCloudWithLambdaFunctionality();
    }

    // Endpoint to leverage the benefits of serverless computing
    @PostMapping("/leverageBenefitsOfServerlessComputing")
    public void leverageBenefitsOfServerlessComputing() {
        lambdaFunctionalityService.leverageBenefitsOfServerlessComputing();
    }

    // Endpoint to improve the scalability, availability, and reliability of the application's backend
    @PostMapping("/improveScalabilityAvailabilityReliability")
    public void improveScalabilityAvailabilityReliability() {
        lambdaFunctionalityService.improveScalabilityAvailabilityReliability();
    }

}