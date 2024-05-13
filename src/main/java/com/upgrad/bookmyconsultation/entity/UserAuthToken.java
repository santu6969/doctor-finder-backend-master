/*
 * Copyright 2018-2019, https://beingtechie.io.
 *
 * File: UserAuthToken.java
 * Date: May 5, 2018
 * Author: Thribhuvan Krishnamurthy
 */
package com.upgrad.bookmyconsultation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;


/**
 * User Entity JPA mapping class.
 **/
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthToken {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	@Column(name = "ACCESS_TOKEN", length = 1000)
	private String accessToken;

	private ZonedDateTime loginAt;

	private ZonedDateTime expiresAt;

	private ZonedDateTime logoutAt;

	public String getAccessToken() {
		return this.accessToken;
	}

	public ZonedDateTime getExpiresAt() {
		return this.expiresAt;
	}

	public ZonedDateTime getLogoutAt() {
		return this.logoutAt;
	}

	public User getUser() {
		return this.user;
	}

	public void setLogoutAt(ZonedDateTime logOutTime) {
		this.logoutAt = logOutTime;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setAccessToken(String authToken) {
		this.accessToken = authToken;
	}

	public void setLoginAt(ZonedDateTime loginTime) {
		this.loginAt = loginTime;
	}

	public void setExpiresAt(ZonedDateTime expiresAt) {
		this.expiresAt = expiresAt;
	}
}
