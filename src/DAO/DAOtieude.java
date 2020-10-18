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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Thanh Nhan
 */
public class DAOtieude {
    ArrayList<Tieude> dstd;
  
    
    public DAOtieude(){
		dstd= new ArrayList<Tieude>();	
             
		
    }
    
     public  ArrayList<Tieude> doctubang()  {
			
		try {
		Connection con = Database.getInstance().getConnection();
		 String sql = "Select * from tieude";
		 Statement statement = con.createStatement();
	      
	      ResultSet rs = statement.executeQuery(sql);
	     
	      while (rs.next()) {
	      
                 
	          String matieude= rs.getString(1);
	          String tentieude= rs.getString(2);
                  int soluong=rs.getInt(3);
                  String trangthai=rs.getString(4);
                  Double dongia=rs.getDouble(5);
                  String maloai=rs.getString(6);
                  
	          Tieude td=new Tieude(matieude, tentieude, soluong, trangthai, dongia, new Loai(maloai));
	         
                   dstd.add(td);
	      }
		} catch (SQLException e) {
			e.printStackTrace();
	     
		}
	return dstd;
    }
     
      public boolean themtieude(Tieude td){
        Connection con = Database.getInstance().getConnection();
		PreparedStatement statement = null;
		int n= 0;
		try {
			statement = con.prepareStatement("insert into tieude values(?,?,?,?,?,?)");
			statement.setString(1, td.getMatieude());
			statement.setString(2, td.getTentieude());
                        statement.setInt(3, td.getSoluong());
                        statement.setString(4, td.getTrangthai());
			statement.setDouble(5, td.getDongiathue());
                        statement.setString(6, td.getMaloai().getMaloai());
                       
			
			n = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
                }
                finally {
			try {
				statement.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return n>0;
        
    }
      
      public boolean deletetieude(String ma) {
			Connection con = Database.getInstance().getConnection();
			PreparedStatement stmt = null;
			int n = 0;
			try {
				stmt = con.prepareStatement("delete from tieude where matieude = ?");
				stmt.setString(1, ma);
				n = stmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return n > 0; 
    }
    
}
