package com.service;

import java.util.List;

import com.dao.ProductDAO;
import com.entity.ProductDTO;

public class ProductService {
	
	ProductDAO dao;

	
	public List<ProductDTO> selectProduct() {
		return dao.selectProduct();
	}
	

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}
	
	
	public ProductService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductService(ProductDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "ProductService [dao=" + dao + "]";
	}


	
	

}
