package com.spsp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spsp.model.Enquiry;
import java.util.List;


@Repository
public interface EnquiryRepository extends CrudRepository<Enquiry, Integer> {
	
//	List<Enquiry> findByUnameAndPassword(String uname,String pass);

}
