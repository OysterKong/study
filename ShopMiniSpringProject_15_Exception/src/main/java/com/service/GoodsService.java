package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.GoodsDAO_Interface;
import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

@Service
public class GoodsService {
	
	@Autowired
	GoodsDAO_Interface dao; //�������̽� Ÿ��

	public List<GoodsDTO> goodsList(String gCategory) throws Exception {
		//System.out.println("dao : "+dao);
		List<GoodsDTO> list = dao.goodsList(gCategory);
		return list;
	}

	public GoodsDTO goodsRetrieve(String gCode) throws Exception {
		GoodsDTO dto = dao.goodsRetrieve(gCode);
		return dto;
	}

	public void cartAdd(CartDTO cart) throws Exception {
		dao.cartAdd(cart);
		
	}

	public List<CartDTO> cartList(String userid) throws Exception {
		List<CartDTO> list = dao.cartList(userid);
		return list;
	}

	public void cartUpdate(Map<String, String> map) throws Exception {
		dao.cartUpdate(map);
		
	}

	public void cartDelete(int num) throws Exception {
		dao.cartDelete(num);
		
	}

	public void delAllCart(ArrayList<String> list) throws Exception {
		dao.delAllCart(list);
		
	}

	public CartDTO orderConfirmByNum(int num) throws Exception {
		CartDTO dto = dao.orderConfirmByNum(num);
		return dto;
	}
	
	@Transactional
	public void orderDone(OrderDTO oDTO, int orderNum) throws Exception {
		dao.orderDone(oDTO); //�ֹ����� ����
		dao.cartDelete(orderNum); //īƮ���� ���� �� ó���� transaction ó����, root-context.xml �� tx-manager ��� �ʿ�
	}



}
