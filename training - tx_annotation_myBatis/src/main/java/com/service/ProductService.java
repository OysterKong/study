package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDAO;
import com.entity.OrderDTO;
import com.entity.ProductDTO;

public class ProductService {
	
	@Autowired
	ProductDAO dao;
	
	
	
	

	public ProductService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductService(ProductDAO dao) {
		super();
		this.dao = dao;
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "ProductService [dao=" + dao + "]";
	}

	public List<ProductDTO> select() {
		return dao.select();
	}
	
	@Transactional
	public void addOrder(String pcode, int quantity) throws Exception {
		dao.addOrder(pcode, quantity);
		
	}

	public List<OrderDTO> selectOrder() {
		// TODO Auto-generated method stub
		return dao.selectOrder();
	}
	
	

}
