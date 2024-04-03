package com.PFE.GStagiaire.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.PFE.GStagiaire.Service.LoginRequest;
import com.PFE.GStagiaire.Service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    // Autres méthodes existantes pour gérer les utilisateurs  

    @PutMapping("/{userId}/roles/{roleId}")
    public ResponseEntity<?> addUserToRole(@PathVariable Long userId, @PathVariable Long roleId, @RequestBody LoginRequest loginRequest) {
        userService.addUserToRole(userId, roleId, loginRequest);
        return ResponseEntity.ok().build();
    }
}
   