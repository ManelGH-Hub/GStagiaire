package com.PFE.GStagiaire.Service;

import java.util.List;
import com.PFE.GStagiaire.Entity.User;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
    void addUserToRole(Long userId, Long roleId);
    void addUserToRole(Long userId, Long roleId, LoginRequest loginRequest);
}
