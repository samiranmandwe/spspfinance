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
public class BussinessDetails {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int	bdId;
private String bussinessType;	
private String	companyPan	;
private String bussinessAge;
private String	annualIncome;



}
