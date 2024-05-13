package com.upgrad.bookmyconsultation.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;




//mark this class as an 'entity class'
//Use Data annotation to generate boilerplate code
//Use NoArgsConstructor annotation
//create a class name Rating
	//create a primary key called 'id' of type String
	//initialise id with a UUID using UUID.randomUUID
	//create appointmentId of type String
	//create doctorId of type String
	//create rating of type Integer
	//create comments of type String
	//Set access modifiers for all these members to 'private'
@Data
@Entity
@NoArgsConstructor
public class Rating {
	@Id
	private String id = UUID.randomUUID().toString();
	private String appointmentId;
	private String doctorId;
	private Integer rating;
	private String comments;
	public void setId(String string) {
		// TODO Auto-generated method stub
		this.id = string;
	}
	public Integer getRating() {
		// TODO Auto-generated method stub
		return this.rating;
	}
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	public String getDoctorId() {
		// TODO Auto-generated method stub
		return this.doctorId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public void setRating(String ratings) {
		this.rating = Integer.valueOf(ratings);
	}

}
	
