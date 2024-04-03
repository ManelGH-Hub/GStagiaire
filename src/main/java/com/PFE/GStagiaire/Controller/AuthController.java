package com.PFE.GStagiaire.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PFE.GStagiaire.Service.AuthService;
import com.PFE.GStagiaire.Service.LoginRequest;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        String login = loginRequest.getlogin();
        String password = loginRequest.getPassword();
        if (authService.authenticate(login, password)) {
            return "Login successful"; // Connexion réussie
        } else {
            return "Invalid login or password"; // Identifiants invalides
        }
        
        
    }
}
