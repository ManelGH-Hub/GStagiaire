package com.PFE.GStagiaire.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PFE.GStagiaire.Entity.User;
import com.PFE.GStagiaire.Repository.UserRepository;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(String login, String password) {
        User user = userRepository.findByLogin(login);
        if (user != null && user.getPassword().equals(password)) {
            return true; // Authentification réussie
        }
        return false; // Authentification échouée
    }
}

