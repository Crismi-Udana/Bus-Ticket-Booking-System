/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;

/**
 *
 * @author Crismi Udana
 */
public class CommonDao {
    
    public static Statement getConnection(){
     
       Statement stm = null;
       
        try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bus_ticket_booking_system","root","1234");
        stm = con.createStatement();
        }
        catch(SQLException e){
            System.out.println("You Have Following Errors : " + e.getMessage());
        }
    }
}
