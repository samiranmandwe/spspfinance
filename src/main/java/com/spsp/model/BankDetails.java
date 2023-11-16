package com.spsp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BankDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bankId;
	private String accountHolderName;
	private long accountNo;
	private String accountType;
	private String ifsc;
	private String branch;
	private String status;
	

}
