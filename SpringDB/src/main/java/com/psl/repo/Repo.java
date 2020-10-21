package com.psl.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.psl.beans.Orders;
@Repository
public class Repo {

	@Autowired
	private final JdbcTemplate jdbctemp;
	
	public Repo(JdbcTemplate jdbctemp) {
		this.jdbctemp=jdbctemp;
	}
	
	
	public void save(Orders order)
	{
		String sqlq="insert into orders(order_number,cust_number) values(?,?)";
		//String sqlquery="insert into orders values(?,?,?,?,?,?,?)";
		//jdbctemp.update(sqlquery,order.getOrderNumber(),order.getOrderDate(),order.getStauts()order.getReqDate(),order.getShippedDate(),,order.getComment(),order.getCustNumber());
		jdbctemp.update(sqlq, order.getOrderNumber(),order.getCustNumber());
	}
	/*
	 * OrderNumber = orderNumber;
		OrderDate = orderDate;
		this.reqDate = reqDate;
		this.shippedDate = shippedDate;
		this.stauts = stauts;
		this.comment = comment;
		this.custNumber = custNumber;
	 * 
	 * */
	
	
	
	
}
