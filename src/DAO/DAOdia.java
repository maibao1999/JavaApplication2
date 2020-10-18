/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectDB.Database;
import Entity.Dia;
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
public class DAOdia {
    ArrayList<Dia> dsd;
  
    
    public DAOdia(){
		dsd= new ArrayList<Dia>();	
             
		
    }
    
     public  ArrayList<Dia> doctubang()  {
			
		try {
		Connection con = Database.getInstance().getConnection();
		 String sql = "Select * from dia";
		 Statement statement = con.createStatement();
	      
	      ResultSet rs = statement.executeQuery(sql);
	     
	      while (rs.next()) {
	      
                 
	          String madia= rs.getString(1);
	          String matieude= rs.getString(2);
                  
                  String trangthai=rs.getString(4);
               
                  
	          Dia d=new Dia(madia, new Tieude(matieude), trangthai);
	         
                   dsd.add(d);
	      }
		} catch (SQLException e) {
			e.printStackTrace();
	     
		}
	return dsd;
    }
     
}
