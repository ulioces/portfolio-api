package com.jcmb.portfolio.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "data")
public class Data {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = true, unique = true)
	private String phone;

	@Column(nullable = true)
	private String english_level;

	@Column(nullable = true)
	private String about_me;

	@Column(nullable = true)
	private String city;
	
	@Column(nullable = true)
	private String country;
	
	@Column(nullable = true)
	private String email;
	
	@Column(nullable = true)
	private String linkedin;

	@Override
	public String toString() {
		return "Data{" +
				"id=" + id +
				", phone='" + phone + '\'' +
				", about_me=" + about_me +
				'}';
	}
}
