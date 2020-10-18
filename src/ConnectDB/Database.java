/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Thanh Nhan
 */
public class Database {
         public  static Connection con = null;
	 private static Database instance = new Database();
	 public static Database getInstance() {
			return instance;
		}
	public void connect() {
		String url = "jdbc:sqlserver://localhost:1433;databasename=qlbd";
		String user = "sa";
		String password = "1";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return con;
	}
  
}
