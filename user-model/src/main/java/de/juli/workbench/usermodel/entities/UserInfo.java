package de.juli.workbench.usermodel.entities;

public class UserInfo {
	private String firsName; 
	private String lastName;
	private String signature;
	private String immage;
	private User user;
	
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getImmage() {
		return immage;
	}
	public void setImmage(String immage) {
		this.immage = immage;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserInfo [firsName=");
		builder.append(firsName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", signature=");
		builder.append(signature);
		builder.append(", immage=");
		builder.append(immage);
		builder.append("]");
		return builder.toString();
	}
}
