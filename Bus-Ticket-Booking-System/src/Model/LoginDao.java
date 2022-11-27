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
        
        //"INSERT INTO `user`( `firstname`, `lastname`, `mobile`, `address`, `gender`, `e('"+fname+"','"+lname+"','"+mobile+"','"+address+"','"+gender+"','"+email+"')"
        int i = 0;
        try{            
          CommonDao.getConnection().executeUpdate("INSERT INTO `passenger` (`name`,`dob`,`nic`,`gender`,`mobile`,`email`) VALUES ('" + name +"',' " + dob +"',' " + nic +"',' " + gender +"',' " + mobile +"',' " + email +"')");
          i = 1;
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Can't Connect As : " + e.getMessage());
         i = 0;
        }
    return i;
    }
    
    
    public static void registerUser(String username,String password){
        try{            
          CommonDao.getConnection().executeUpdate("INSERT INTO `login` (`username`,`pword`) VALUES ('" + username +"',' " + password +"')");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Can't Connect As : " + e.getMessage());
        }
    }
    
    public static int CheckUserExist(String username){
        
        int i = 0;
        
        try{            
          ResultSet rs = CommonDao.getConnection().executeQuery("SELECT username FROM `login`WHERE username = '" + username +"' ");
          
          if(rs.next()){
              i = 1;
          }
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Can't Connect As : " + e.getMessage());
            i = 0;
        }
    
        return i;
    }
    
    public static int checkLogin(String username,String password){
        int i = 0;
        
        try{            
          ResultSet rs = CommonDao.getConnection().executeQuery("SELECT * FROM `login` WHERE username ='" + username + "' AND pword ='" + password +"'");
          
          if(rs.next()){
              i = 1;
          }
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Can't Connect As : " + e.getMessage());
            i = 0;
        }
        System.out.println(i);
        return i;
    }
}
