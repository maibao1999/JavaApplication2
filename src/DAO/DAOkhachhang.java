/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectDB.Database;
import Entity.Khachhang;
import Entity.Loai;
import Entity.Tieude;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Thanh Nhan
 */
public class DAOkhachhang {
     ArrayList<Khachhang> dskh;
  
    
    public DAOkhachhang(){
		dskh= new ArrayList<Khachhang>();	
             
		
    }
    
     public  ArrayList<Khachhang> doctubang()  {
			
		try {
		Connection con = Database.getInstance().getConnection();
		 String sql = "Select * from khachhang";
		 Statement statement = con.createStatement();
	      
	      ResultSet rs = statement.executeQuery(sql);
	     
	      while (rs.next()) {
	      
                 
	          String makh= rs.getString(1);
	          String tenkh= rs.getString(2);
                 
                  String sdt=rs.getString(3);
                
                  String diachi=rs.getString(4);
                  
	          Khachhang kh=new Khachhang(makh, tenkh, sdt, diachi);
	         
                //   dstd.add(td);
	      }
		} catch (SQLException e) {
			e.printStackTrace();
	     
		}
	return dskh;
}
}
