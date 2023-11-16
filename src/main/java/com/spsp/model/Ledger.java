package com.spsp.model;

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
public class Ledger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int lid;
	private String ldate;
	private double balanceAmount;
	private double emi;
	private String lstatus;

	
	

}
