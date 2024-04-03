package com.PFE.GStagiaire.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long UserId;
    private String nom;
    private String prenom;
    private String CIN;
    private String TEL;
    private String login;
    private String password;
    public Long getId() {
		return UserId;
	}

	public void setId(Long id) {
		this.UserId = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public String getTEL() {
		return TEL;
	}

	public void setTEL(String tEL) {
		TEL = tEL;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public List<User> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}


	@ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@JoinTable(
	    name = "user_roles",
	    joinColumns = @JoinColumn(name = "user_id"),
	    inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();
	public void addRole(Role role) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}

