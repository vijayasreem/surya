package com.surendradvpp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.surendradvpp.repository.LambdaFunctionalityRepository;

@Service
public class LambdaFunctionalityService {

    @Autowired
    private LambdaFunctionalityRepository repository;
    
    // Method to incorporate the AWS cloud into the sacral AI application by implementing Lambda functionality
    public void incorporateAWSCloudWithLambdaFunctionality() {
        repository.incorporateAWSCloudWithLambdaFunctionality();
    }
    
    // Method to leverage the benefits of serverless computing
    public void leverageBenefitsOfServerlessComputing() {
        repository.leverageBenefitsOfServerlessComputing();
    }
    
    // Method to improve the scalability, availability, and reliability of the application's backend
    public void improveScalabilityAvailabilityReliability() {
        repository.improveScalabilityAvailabilityReliability();
    }

}