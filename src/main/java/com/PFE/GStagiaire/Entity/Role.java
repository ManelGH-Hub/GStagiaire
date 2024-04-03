package com.PFE.GStagiaire.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

//Role.java
@Entity
public class Role {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long RoleId;

 @Enumerated (EnumType.STRING)
 private RoleType name;

public Long getId() {
	return RoleId;
}

public void setId(Long id) {
	this.RoleId = id;
}

@ManyToMany(mappedBy = "roles")
private Set<User> users = new HashSet<>();

public Object getname() {
	// TODO Auto-generated method stub
	return null;
}


}
