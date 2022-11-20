/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LoginDao;

/**
 *
 * @author Crismi Udana
 */
public class LoginController {
    
    public static int register(String name, String nic, String dob, String gender, String mobile, String email,String username,String password){
        int i = LoginDao.registerPassenger(name, nic, dob, gender, mobile, email);
        LoginDao.registerUser(username, password);
        
        return i;
    }
    
    public static int Login(String username,String password){
        
        int i = LoginDao.CheckUserExist(username);        
        int j = LoginDao.checkLogin(username,password);
        int k = 0;
        
        if(j == 1){
            k = 1;
        }else{
            k=0;
        }
        
        return k;
    }
}
