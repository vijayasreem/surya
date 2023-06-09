package com.surendradvpp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordEncryptionRepository extends JpaRepository<User, Long> {

    //Finds the user with the given username
    User findByUsername(String username);

    //Encrypts a password using a strong and secure algorithm such as bcrypt or Argon2
    String encryptPassword(String password);

    //Compares a given password with the stored encrypted password
    boolean comparePasswords(String password, String storedEncryptedPassword);

}