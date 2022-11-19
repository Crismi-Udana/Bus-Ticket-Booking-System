/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Crismi Udana
 */
public class LoginDao {
    public static int registerPassenger(String name, String nic, String dob, String gender, String mobile, String email){
        String sql = "INSERT INTO passenger (name,dob,nic,gender,mobile,email) VALUES ( ' " + name +"',' " + dob +"',,' " + nic +"',' " + gender +"',' " + mobile +"',' " + email +"');";
        
        int i = 0;
        try{            
          CommonDao.getConnection().executeUpdate(sql);
          i = 1;
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Can't Connect As : " + e.getMessage());
         i = 0;
        }
    return i;
    }
    public static void registerUser(String username,String password){
        
    }
}
