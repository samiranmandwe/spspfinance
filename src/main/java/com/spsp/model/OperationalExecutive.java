package com.spsp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class OperationalExecutive {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int eid;
	private String fullname;
	private int mobileNo;
	private String emailId;
	private String pancardNo;
	private int age;
	private String address;
	private String uname;
	private String password;
	private String gender;

}
