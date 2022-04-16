package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.entity.OrderDTO;
import com.entity.ProductDTO;

public class ProductDAO {
	
	
	@Autowired
	SqlSessionTemplate template;

	public ProductDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDAO(SqlSessionTemplate template) {
		super();
		this.template = template;
	}

	public SqlSessionTemplate getTemplate() {
		return template;
	}

	public void setTemplate(SqlSessionTemplate template) {
		this.template = template;
	}

	@Override
	public String toString() {
		return "ProductDAO [template=" + template + "]";
	}

	public List<ProductDTO> select() {
		return template.selectList("select");
	}
	
	@Transactional
	public void addOrder(String pcode, int quantity) throws Exception {
		
		OrderDTO dto = new OrderDTO();
		
		dto.setPcode(pcode);
		dto.setQuantity(quantity);
		
		template.insert("order.orderInsert", dto);
		//template.update("product.productUpdate", dto);
		template.update("product.productate", dto);
		
	}

	public List<OrderDTO> selectOrder() {
		return template.selectList("selectOrder");
	}
	
	

}
