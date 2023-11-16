package com.spsp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class EmailSenderWithAttachment {
	
	
	
	private int docId;
	private String toEmail;
	private String fromEmail;
	private String subject;
	private String textBody;
	
	@Lob
	private byte[] photo;

}
