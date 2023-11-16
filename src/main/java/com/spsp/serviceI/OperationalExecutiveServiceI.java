package com.spsp.serviceI;

import com.spsp.model.Enquiry;

public interface OperationalExecutiveServiceI {
	
	public Iterable<Enquiry> getAll();
	
	public Enquiry saveEnquiry(Enquiry e);



}
