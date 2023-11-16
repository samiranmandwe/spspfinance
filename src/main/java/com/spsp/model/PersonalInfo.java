package com.spsp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PersonalInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String firstName;
	private String lastName;
	private long mobileNo;
	private String emailId;
	@Column(unique = true)
	private String pancardNo;
	
	@Column(unique = true)
	private long adharNo;
	private String dateOfBirth;
	private String bussinessAge;
	private String	annualIncome;
	private String address;
	private String typeOfBussiness;

}
