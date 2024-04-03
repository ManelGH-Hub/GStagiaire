package com.PFE.GStagiaire.Repository;

import com.PFE.GStagiaire.Entity.User; // Importez la classe User correcte
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Méthodes personnalisées si nécessaire
	
	User findByLoginAndPassword(String login, String password);

	User findByLogin(String login);
	
}
