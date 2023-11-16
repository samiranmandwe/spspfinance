package com.spsp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class GaurantorDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int gId;
	private String garName;
	private String garAddress;
	private long contactNo;
	private String pancardNo;
	private long adharNo;

}
