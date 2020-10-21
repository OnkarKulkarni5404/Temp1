package com.psl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.beans.Orders;
import com.psl.repo.Repo;

@Service("service")
public class MainService {
	
	@Autowired
	private Repo repo;
	

	public void insertOrder(Orders order) {
		repo.save(order);
		
	}
	
	
	
	
}
