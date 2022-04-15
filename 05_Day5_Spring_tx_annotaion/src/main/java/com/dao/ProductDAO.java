package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.entity.OrderDTO;
import com.entity.ProductDTO;

public class ProductDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//전체 상품 목록
	public List<ProductDTO> selectProduct() {
		
		String query = "select * from t_product order by pcode";
		return jdbcTemplate.query(query, new RowMapper<ProductDTO>() {

			@Override
			public ProductDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				ProductDTO dto = new ProductDTO();
				dto.setPcode(rs.getString("pcode"));
				dto.setPname(rs.getString("pname"));
				dto.setPrice(rs.getInt("price"));
				dto.setQuantity(rs.getInt("quantity"));
				return dto;
			}

		});
	} //end select
	
	
	//전체주문목록
	public List<OrderDTO> selectOrder() {
		
		String query = "select * from t_order order by pcode";
		return jdbcTemplate.query(query, new RowMapper<OrderDTO>() {
			
			@Override
			public OrderDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				OrderDTO dto = new OrderDTO();
				dto.setNum(rs.getInt("pNum"));
				dto.setPcode(rs.getString("pcode"));
				dto.setQuantity(rs.getInt("quantity"));
				return dto;
			}

		});
	} //end select
	
	
	//주문
	public void addOrder(String pcode, int quantity) throws Exception {
		
		String sql = "insert into t_order ( num, pcode, quantity ) values ( t_order_seq.nextval, ? , ? )";
		
		int n = jdbcTemplate.update(sql, pcode, quantity);
		System.out.println("insert 갯수 : "+ n);
		// 오더테이블에 insert후
		//String sql2 = " update t_product set quantity = quantity - ?, where pcode = ?";
		String sql2 = " up t_product set quantity = quantity - ?, where pcode = ?";
		//update 쿼리를 잘못 작성하여 일부러 에러를 발생시킴 - 수량감소
		int n2 = jdbcTemplate.update(sql2, quantity, pcode);
		
	} // end insert



	

}
