package com.upgrad.bookmyconsultation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
	@Id
	private String appointmentId = UUID.randomUUID().toString();
	private String doctorId;
	private String doctorName;
	private String userId;
	private String userName;
	private String userEmailId;
	private String timeSlot;
	private String status;
	private String appointmentDate;
	@JsonIgnore
	private String createdDate;
	private String symptoms;
	private String priorMedicalHistory;
	public String getAppointmentId() {
		return this.appointmentId;
	}
	public String getDoctorId() {
		return this.doctorId;
	}
	public String getDoctorName() {
		return this.doctorName;
	}	
	public String getSymptoms() {
		return this.symptoms;
	}	
	public String getpriorMedicalHistory() {
		return this.priorMedicalHistory;
	}	
	public String getTimeSlot() {
		return this.timeSlot;
	}
	public String getAppointmentDate() {
		return this.appointmentDate;
	}
	public String getUserId() {
		return this.userId;
	}

}
