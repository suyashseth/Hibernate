package com.pract;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Usercreden") 
public class UserCredential {

	@Id
	@Column(name="c_id")
	@GeneratedValue(strategy=GenerationType.TABLE )
	private int credential_id;
	@Column(name="username")
	private String user_name;
	@Column(name="pass")
	private String password;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getCredential_id() {
		return credential_id;
	}
	public void setCredential_id(int credential_id) {
		this.credential_id = credential_id;
	}
	public String getUser_id() {
		return user_name;
	}
	public void setUser_id(String user_id) {
		this.user_name = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
