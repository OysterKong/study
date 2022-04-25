package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

@Repository
public class GoodsDAO {
	
	@Autowired
	SqlSessionTemplate template;

	public List<GoodsDTO> goodsList(String gCategory) {
		//System.out.println("session.template : "+ template);
		List<GoodsDTO> list = template.selectList("GoodsMapper.goodsList", gCategory);
		return list;
	}

	public GoodsDTO goodsRetrieve(String gCode) {
		GoodsDTO dto = template.selectOne("GoodsMapper.goodsRetrieve", gCode);
		return dto;
	}

	public void cartAdd(CartDTO cart) {
		template.insert("CartMapper.cartAdd", cart);
		
	}

	public List<CartDTO> cartList(String userid) {
		List<CartDTO> list = template.selectList("CartMapper.cartList", userid);
		return list;
	}

	public void cartUpdate(Map<String, String> map) {
		int n = template.update("CartMapper.cartUpdate", map);
		System.out.println("수정되었으면 1뜨면 된다 :"+n);  //수정되는지 확인하고자하는 코드,  수정이 정상적으로되면 1 이 찍힘
	}

	public void cartDelete(int num) {
		int n = template.delete("CartMapper.cartDelete", num);
		System.out.println("삭제되었으면 1뜨면 된다 :"+n);  //삭제되는지 확인하고자하는 코드,  삭제가 정상적으로되면 1 이 찍힘
	}

	public void delAllCart(ArrayList<String> list) {
		int n = template.delete("CartMapper.cartAllDel", list);
		System.out.println("전체삭제기능이 성공하면 삭제한 상품 갯수가 뜨면 된다 :" + n);
	}

	public CartDTO orderConfirmByNum(int num) {
		CartDTO dto = template.selectOne("CartMapper.cartByNum", num);
		return dto;
	}

	public void orderDone(OrderDTO oDTO) {
		int n = template.insert("CartMapper.orderDone", oDTO);
		
	}

}
