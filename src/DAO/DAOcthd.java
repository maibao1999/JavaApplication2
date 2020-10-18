/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectDB.Database;
import Entity.Chitiethoadon;
import Entity.Dia;
import Entity.Hoadon;
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
public class DAOcthd {
      ArrayList<Chitiethoadon> dscthd;
  
    
    public DAOcthd(){
		dscthd= new ArrayList<Chitiethoadon>();	
             
		
    }
    
     public  ArrayList<Chitiethoadon> doctubang()  {
			
		try {
		Connection con = Database.getInstance().getConnection();
		 String sql = "Select * from chitiethoadon";
		 Statement statement = con.createStatement();
	      
	      ResultSet rs = statement.executeQuery(sql);
	     
	      while (rs.next()) {
	      
                 
	          String madia= rs.getString(1);
	          String mahd= rs.getString(2);
                 
                  Double dongiathue=rs.getDouble(3);
                
                  
	          Chitiethoadon cthd=new Chitiethoadon(new Dia(madia), new Hoadon(mahd), dongiathue);
	         
                   dscthd.add(cthd);
	      }
		} catch (SQLException e) {
			e.printStackTrace();
	     
		}
	return dscthd;
    }
}
