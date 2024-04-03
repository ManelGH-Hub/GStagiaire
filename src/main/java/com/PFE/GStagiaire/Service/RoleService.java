package com.PFE.GStagiaire.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PFE.GStagiaire.Entity.Role;
import com.PFE.GStagiaire.Repository.RoleRepository;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    public Role updateRole(Long id, Role role) {
        if (roleRepository.existsById(id)) {
            role.setId(id);
            return roleRepository.save(role);
        }
        return null;
    }

    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}