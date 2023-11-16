package com.spsp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Documentsupload {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int docid;
	@Lob
	private byte[] adharCard;
	
	@Lob
	private byte[] pancard;
	
	
	@Lob
	private byte[] photo;
	
	@Lob
	private byte[] leftThumb;
	
	@Lob
	private byte[] partnershipDeed;
	
	@Lob
	private byte[] gaurantorphoto;
	
	@Lob
	private byte[] gaurantorSignature;
	
	@Lob
	private byte[] annualIncome;
	
	@Lob
	private byte[] collateralCertificate;

	
	private int regId;
}
