/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectDB.Database;

import Entity.Taikhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Thanh Nhan
 */
public class DAOTaikhoan {
      ArrayList<Taikhoan> dstk;
	
	
	public DAOTaikhoan(){
		dstk= new ArrayList<Taikhoan>();	
		
	}	
	public  ArrayList<Taikhoan> docTuBang()  {
			
		try {
		Connection con = Database.getInstance().getConnection();
		 String sql = "Select * from taikhoan";
		 Statement statement = con.createStatement();
	    
	      ResultSet rs = statement.executeQuery(sql);
	      // Duyệt trên kết quả trả v�?.
	      while (rs.next()) {// Di chuyển con tr�? xuống bản ghi kế tiếp.
	      
                  String id=rs.getString(1);
	          String mk= rs.getString(2);
	         
	          Taikhoan s = new Taikhoan(id,mk);
                     dstk.add(s);
	      }
		} catch (SQLException e) {
			e.printStackTrace();
	     
		}
	return dstk;
 }
        
       
}
