package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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


	

}
