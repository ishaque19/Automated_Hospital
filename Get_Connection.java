/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management;

import java.sql.*;

/**
 *
 * @author User
 */
public class Get_Connection {
    public static Connection connect_to_database() throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management?serverTimezone=UTC","root","");
	if(conn!=null){
		System.out.println("Connnected successfully");
                return conn;
        }
        else{
            System.out.println("Not Connected!!");
            return null;
        }
    }
}
