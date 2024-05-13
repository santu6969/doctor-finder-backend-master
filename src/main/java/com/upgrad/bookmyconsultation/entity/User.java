package com.upgrad.bookmyconsultation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;




//Mark it with Data, Entity, Builder, NoArgsConstructor, AllArgsConstructor
//create a class named User
	//create firstName of type String
	//create lastName of type String
	//create dob of type String
	//create mobile of type String
	//create primary key 'emailId' of type String
	//create password of type String
	//create createdDate of type String
	//create salt of type String
	//all the mentioned members must be private

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private String firstName;
	private String lastName;
	private String dob;
	private String mobile;
	@Id
	private String emailId;
	private String password;
	private String createdDate;
	private String salt;
	public void setCreatedDate(String string) {
		this.createdDate = string;
	}
	public String getPassword() {
		return this.password;
	}
	public void setSalt(String string) {
		this.salt = string;
	}
	public void setPassword(String string) {
		this.password = string;
	}
	public @NotNull String getEmailId() {
		return this.emailId;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getMobile() {
		return this.mobile;
	}
	public String getSalt() {
		return this.salt;
	}

}