package com.spsp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SanctionLoan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sanctionid;
	private String sanctionDate;
    private long loanAmtSanctioned;
    private float rateOfInterest;
	



}
