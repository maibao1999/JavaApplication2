/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectDB.Database;
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
public class DAOloai {
    ArrayList<Loai> dsl;
  
    
    public DAOloai(){
		dsl= new ArrayList<Loai>();	
             
		
    }
    
     public  ArrayList<Loai> doctubang()  {
			
		try {
		Connection con = Database.getInstance().getConnection();
		 String sql = "Select * from loai";
		 Statement statement = con.createStatement();
	      
	      ResultSet rs = statement.executeQuery(sql);
	     
	      while (rs.next()) {
	      
                 
	          String maloai= rs.getString(1);
	          String tenloai= rs.getString(2);
                
                  
	          Loai l = new Loai(maloai, tenloai);
	         
                  dsl.add(l);
	      }
		} catch (SQLException e) {
			e.printStackTrace();
	     
		}
	return dsl;
    }
}
