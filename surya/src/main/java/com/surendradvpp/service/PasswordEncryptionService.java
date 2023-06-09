package com.surendradvpp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surendradvpp.repository.PasswordEncryptionRepository;
import com.surendradvpp.model.User;

@Service
public class PasswordEncryptionService {

    @Autowired
    PasswordEncryptionRepository passwordEncryptionRepository;

    public User findByUsername(String username) {
        return passwordEncryptionRepository.findByUsername(username);
    }

    public String encryptPassword(String password) {
        return passwordEncryptionRepository.encryptPassword(password);
    }

    public boolean comparePasswords(String password, String storedEncryptedPassword) {
        return passwordEncryptionRepository.comparePasswords(password, storedEncryptedPassword);
    }
}