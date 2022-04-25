package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

//@Repository
public class GoodsDAO_mySQL_Impl implements GoodsDAO_Interface {

	@Override
	public List<GoodsDTO> goodsList(String gCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GoodsDTO goodsRetrieve(String gCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cartAdd(CartDTO cart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CartDTO> cartList(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cartUpdate(Map<String, String> map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cartDelete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delAllCart(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CartDTO orderConfirmByNum(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void orderDone(OrderDTO oDTO) {
		// TODO Auto-generated method stub
		
	}

}
