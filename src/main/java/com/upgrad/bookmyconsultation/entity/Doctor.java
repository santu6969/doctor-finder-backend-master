package com.upgrad.bookmyconsultation.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.upgrad.bookmyconsultation.enums.Speciality;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Doctor {
	@Id
	private String id = UUID.randomUUID().toString();
	private String firstName;
	private String lastName;
	@Enumerated(EnumType.STRING)
	private Speciality speciality;
	private String dob;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private Address address;
	private String mobile;
	private String emailId;
	private String pan;
	private String highestQualification;
	private String college;
	private Integer totalYearsOfExp;
	private Double rating;
	public void setRating(Double avgRating) {
		// TODO Auto-generated method stub
		this.rating = avgRating;
		
	}
	public Address getAddress() {
		return this.address;
	}
	public void setId(String string) {
		this.id = string;
	}
	public Speciality getSpeciality() {
		return this.speciality;
	}
	public void setSpeciality(Speciality inputSpeciality) {
		this.speciality = inputSpeciality;
	}
	public String getId() {
		return this.id;
	}
	public Integer gettotalYearsOfExp() {
		return this.totalYearsOfExp;
	}
	public Double getRating() {
		return this.rating;
	}
	public void setAddress(Address inputAddress) {
		this.address = inputAddress;
	}
	public String getDob() {
		return this.dob;
	}
	public String getEmailId() {
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
	public String getPan() {
		return this.pan;
	}

}
