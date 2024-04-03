package com.PFE.GStagiaire.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.PFE.GStagiaire.Entity.User;
import com.PFE.GStagiaire.Repository.UserRepository;

import jakarta.transaction.Transactional;

import com.PFE.GStagiaire.Repository.RoleRepository;
import com.PFE.GStagiaire.Entity.Role;
@Transactional
@Service
public  class implementationUser implements UserService {

	@Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void addUserToRole(Long userId, Long roleId, LoginRequest loginRequest) {
        // Vérification de l'authentification de l'utilisateur
        User authenticatedUser = userRepository.findByLoginAndPassword(loginRequest.getlogin(), loginRequest.getPassword());
        if (authenticatedUser == null) {
            throw new ResourceNotFoundException("Authentication failed for user: " + loginRequest.getlogin());
        }

        // Récupération de l'utilisateur à ajouter au rôle
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + userId));

        // Vérification que l'utilisateur authentifié correspond à l'utilisateur à ajouter au rôle
        if (!authenticatedUser.getId().equals(user.getId())) {
            throw new IllegalArgumentException("Authenticated user does not have permission to add user to role");
        }

        // Récupération du rôle
        Role role = roleRepository.findById(roleId)
                .orElseThrow(() -> new ResourceNotFoundException("Role not found with id: " + roleId));

        /// Récupération du rôle
        Role role1 = roleRepository.findById(roleId)
                .orElseThrow(() -> new ResourceNotFoundException("Role not found with id: " + roleId));

        // Ajout du rôle à l'utilisateur
        user.addRole(role); // Utilisez la méthode addRole() de l'objet User

        // Enregistrement de l'utilisateur mis à jour
        userRepository.save(user);
    }

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(Long id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUserToRole(Long userId, Long roleId) {
		// TODO Auto-generated method stub
		
	}

    // Implémentez les autres méthodes de l'interface UserService
}