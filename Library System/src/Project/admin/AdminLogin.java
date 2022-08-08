/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.admin;

import static Project.admin.AdminRW.ReadAdminFile;
import static Project.admin.AdminRW.getA;
import Project.home.Admin;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MOUSTFA
 */
public class AdminLogin extends Project.home.xxLoginAbs {
     public AdminLogin(){
        super();
        jLabel3.setText("Admin Login");
        
        
     }
  @Override
    protected void login()
    {                                      
         try {
            // TODO add your handling code here:
            ReadAdminFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       String usernamee = username.getText();
       String password = pass.getText();
       boolean found = false;
        for (int i = 0; i <Admin.getNum(); i++) {
            if (getA()[i].getName().equals(usernamee) && getA()[i].getPassword().equals(password)) {
                found = true;
                JOptionPane.showMessageDialog(this, "Welcome");
                this.hide();
                AdminSection f =new AdminSection();
                f.setVisible(true);
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, "Invalid");
        }
    }                 
    }                                           

