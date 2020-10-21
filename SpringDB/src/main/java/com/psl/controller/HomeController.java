package com.psl.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psl.beans.Orders;
import com.psl.service.MainService;

@RestController
@RequestMapping(path = "/app")
public class HomeController {
	
	
	@Autowired
	private MainService service;
	
	
	@GetMapping("/hello")
	String showData()
	{
		return "Hello Onkar";
	}
	
	
	@GetMapping("/put")
	public String saveOrder() {
		Orders order=new Orders();
		order.setOrderNumber("ok1");
		order.setComment("Handle with care");
		order.setCustNumber("0206080158");
		order.setOrderDate(new Date(0));
		order.setReqDate(new Date(1));
		order.setShippedDate(new Date(0));
		order.setStauts("ORDERED");
		service.insertOrder(order);
		return "Check dbase";
	}
	
	
}
