package de.juli.workbench.usermodel.entities;

import java.sql.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.FIELD)
public class User extends Model {
	@NotNull
	@Column(nullable = false, unique = true)
	private String name;
	@NotNull
	@Column(nullable = false, unique = true)
	private String pass;
	private Date entry_date;
	private Date last_login;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
	private UserInfo userInfo;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Date getEntry_date() {
		return entry_date;
	}
	public void setEntry_date(Date entry_date) {
		this.entry_date = entry_date;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", pass=");
		builder.append(pass);
		builder.append(", entry_date=");
		builder.append(entry_date);
		builder.append(", last_login=");
		builder.append(last_login);
		builder.append(", userInfo=");
		builder.append(userInfo);
		builder.append("]");
		return builder.toString();
	}
}
