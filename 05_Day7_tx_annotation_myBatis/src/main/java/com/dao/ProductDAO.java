package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.entity.OrderDTO;
import com.entity.ProductDTO;

public class ProductDAO {
	
	SqlSessionTemplate template;
	
	public SqlSessionTemplate getTemplate() {
		return template;
	}


	public void setTemplate(SqlSessionTemplate template) {
		this.template = template;
	}
	
	//@Transactional //트렌젝션추가 
	public void addOrder(String pcode, int quantity) throws Exception{
		
		OrderDTO dto = new OrderDTO();
		dto.setPcode(pcode);
		
		dto.setQuantity(quantity);
            
        int n = template.insert("order.orderInsert", dto);     
        System.out.println("order table insert = "+n);
       // template.update("product.productUpdate",dto);//에러 발생 
        template.update("product.produc            ",dto);//에러 발생 코드  ( 코드를 일부러 틀리게 적어서 에러방생시킴 )
        
	}// end insert

    // 전체 상품 목록
	public List<ProductDTO> selectProduct() {

		return template.selectList("productList");

	}// end select

	 // 전체 주문 목록
		public List<OrderDTO> selectOrder() {

			return template.selectList("orderList");
		}// end select





}
