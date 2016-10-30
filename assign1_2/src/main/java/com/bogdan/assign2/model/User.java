package com.bogdan.assign2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author romanb
 *
 */
@Entity
@Table(catalog = "flights", name = "user")
@NamedQueries({ @NamedQuery(name = User.FIND_USER_BY_USERNAME, query = User.QUERY_FIND_BY) })
public class User extends BaseEntity {

	public static final String FIND_USER_BY_USERNAME = "findUserByUsername";
	public static final String QUERY_FIND_BY = "Select u from User u where u.username = :" + User.PARAM_USERNAME;
	public static final String PARAM_USERNAME = "username";

	@Column(name = "firstName", nullable = false, length = 36, unique = false)
	private String firstName;

	@Column(name = "lastName", nullable = false, length = 36, unique = false)
	private String lastName;

	@Column(name = "username", nullable = false, length = 36, unique = true)
	private String username;

	@Column(name = "password", nullable = false, length = 36, unique = false)
	private String password;

	@Column(name = "userRole", nullable = false)
	@Enumerated(EnumType.STRING)
	private UserRole userRole;

	public User() {

	}

	public User(Long id, String firstName, String lastName, String username, String password, UserRole userRole) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.userRole = userRole;
		setId(id);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

}