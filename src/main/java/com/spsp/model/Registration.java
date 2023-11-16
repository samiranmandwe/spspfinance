package com.spsp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator="registration_seq")
	@SequenceGenerator(name="registration_seq",sequenceName="registration_sequence",initialValue=10000,allocationSize=1)
	
	private int regId;
	private String gender;
	private long contactNo;
	private int age;
	private long loanAmount;
	private int tenure;
	private int cibil;
	private String status;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pid")
	private PersonalInfo personal;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bankId")
	private BankDetails bankDetails;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="gId")
	private GaurantorDetails gaurantorDetail;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bdId")
	private BussinessDetails bussinessDetail;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="sanctionid")
	private SanctionLoan sanctionLoan;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="lid")
	private Ledger ledger;
	
	
	
	
	
}




