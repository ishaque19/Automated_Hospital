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
public class Hospital_Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        //new Login_Form().setVisible(true);//version1
        new main_page().setVisible(true); //version2
    }
    
}
