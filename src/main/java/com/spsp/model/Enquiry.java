package com.spsp.model;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer enquiryId;
	private String customerFirstName;
	private String customerLastName;
    private String pancardNumber;
    private Long aadharNumber;
    private long customerMobileNumber;
    private String customerEmailId;
   
	
	private String cibilStatus;
	private Integer cibilScore;
	
	
}
