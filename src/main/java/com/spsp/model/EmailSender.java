package com.spsp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailSender {
	
		private String toEmail;
		private String fromEmail;
		private String subject;
		private String textBody;

	}


