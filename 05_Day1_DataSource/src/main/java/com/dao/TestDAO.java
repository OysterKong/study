package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.dto.TestDTO;

public class TestDAO {

		@Autowired
		DataSource dataSource;
		//드라이버 로딩, 컨넥션 연결 후 받아서 사용하게 됨
		
		public TestDAO() {
			//this.dataSource = dataSource;
		}

		public ArrayList<TestDTO> select(){
				//System.out.println(dataSource);
			ArrayList<TestDTO> list = new ArrayList<TestDTO>();
			  Connection con = null;
			  PreparedStatement pstmt = null;
			  ResultSet rs = null;
			  try{
			  con = 
					  		dataSource.getConnection();//수정됨
	    String sql ="select * from test" ;
			pstmt = con.prepareStatement(sql);
		    rs = pstmt.executeQuery();  // select 는 executeQuery()
		    while(rs.next()){
		    	int n = rs.getInt("num");
		    	String n2 = rs.getString("username");
		    	String n3 = rs.getString("address");
		    	TestDTO dto = new TestDTO(n, n2, n3);
		    	list.add(dto);
		    }
			  }catch(Exception e){
				  e.printStackTrace();
			  }finally{
				  try {
					if(rs!=null)rs.close();  
					if(pstmt!=null)pstmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
			return list;
		}//end select
		
		
		public void insert(int num, String name, String address){
			
			  Connection con = null;
			  PreparedStatement pstmt = null;
			  
			  try{
			  con = 
					  dataSource.getConnection();//수정됨
	String sql ="insert into test (num, username,address) "
			  		+ " values ( ? , ? , ? )" ;
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
		  //insert, delete, update 은 executeUpdate()	
		 int n = pstmt.executeUpdate();
		 
			  }catch(Exception e){
				  e.printStackTrace();
			  }finally{
				  try {
					if(pstmt!=null)pstmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
		}//end insert
		
		
		// num에 해당하는 레코드 수정
				public void update(int num, String name, String address){
					 Connection con = null;
					  PreparedStatement pstmt = null;
					  
					  try{
					  con = 
							  dataSource.getConnection();// 수정됨
			String sql ="update test set username =?, address= ? where num = ?" ;
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(3, num);
					pstmt.setString(1, name);
					pstmt.setString(2, address);
				  //insert, delete, update 은 executeUpdate()	
				 int n = pstmt.executeUpdate();
				 
					  }catch(Exception e){
						  e.printStackTrace();
					  }finally{
						  try {
							if(pstmt!=null)pstmt.close();
							if(con!=null)con.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					  }
				}

		

		public void delete(int num) {
			Connection con = null;
			  PreparedStatement pstmt = null;
			  
			  try{
			  con = 
					  dataSource.getConnection();//수정됨
	String sql ="delete from test where num = ?" ;
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
		  //insert, delete, update 은 executeUpdate()	
		 int n = pstmt.executeUpdate();
		 //dbcp2는 autocommit , 커밋이 없음
			  }catch(Exception e){
				  e.printStackTrace();
			  }finally{
				  try {
					if(pstmt!=null)pstmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
			
		}//end delete
			
}
