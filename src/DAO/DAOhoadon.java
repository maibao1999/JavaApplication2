/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectDB.Database;
import Entity.Hoadon;
import Entity.Khachhang;
import Entity.Loai;
import Entity.Tieude;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Thanh Nhan
 */
public class DAOhoadon {
    ArrayList<Hoadon> dshd;
  
    
    public DAOhoadon(){
		dshd= new ArrayList<Hoadon>();	
             
		
    }
    
     public  ArrayList<Hoadon> doctubang()  {
			
		try {
		Connection con = Database.getInstance().getConnection();
		 String sql = "Select * from hoadon";
		 Statement statement = con.createStatement();
	      
	      ResultSet rs = statement.executeQuery(sql);
	     
	      while (rs.next()) {
	      
                 
	          String mahd= rs.getString(1);
	          String makh= rs.getString(2);
                  Date ngaylap=rs.getDate(3);
                 
                  
	          Hoadon hd=new Hoadon(mahd, new Khachhang(makh), ngaylap);
	         
                   dshd.add(hd);
	      }
		} catch (SQLException e) {
			e.printStackTrace();
	     
		}
	return dshd;
    }
     
}
