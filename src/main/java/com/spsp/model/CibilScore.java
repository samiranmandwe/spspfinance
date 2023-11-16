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
public class CibilScore {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cibilid;
	private int cibilScore;
	private String cibilStatus;
	
	
	
	

}
