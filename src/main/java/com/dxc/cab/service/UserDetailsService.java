package com.dxc.cab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.cab.dao.UserDetailsDao;
import com.dxc.cab.model.UserDetails;


@Service
public class UserDetailsService {
	@Autowired
	UserDetailsDao dao;
	public boolean addUserDetails(UserDetails u) {
		UserDetails userdetails=dao.save(u);
		if(userdetails!=null) {
			return true;
		}
		return false;
	}
//	public boolean validate(UserDetails userdetails) {
//		Optional<UserDetails> optCustomer=dao.findById(customer.getCustomerName());
//		if(optCustomer.isPresent()) {
//			return true;
//		}
//		return false;
//	}
	public List<UserDetails> getAllUserDetails(){
		return dao.findAll();
	}

}
