/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.librarian;

import Project.home.Librarian;
import static Project.librarian.LibrarianRW.ReadLibFile;
import static Project.librarian.LibrarianRW.getL;
import javax.swing.JOptionPane;

/**
 *
 * @author MOUSTFA
 */
public class LibrarianLogin extends Project.home.xxLoginAbs {
     public LibrarianLogin(){
        super();
        jLabel3.setText("Librarian Login"); 
    
}
     @Override
 protected void login()
    {                                      
        ReadLibFile();
        String usernamee = username.getText();
        String password = pass.getText();
       boolean found = false;
        for (int i = 0; i < Librarian.getNum(); i++) {
            if (getL()[i].getName().equals(usernamee) && getL()[i].getPassword().equals(password)) {
                found = true;
                JOptionPane.showMessageDialog(this, "Welcome");
                LibrarianSection f =new LibrarianSection();
                f.setVisible(true);
                this.hide();
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, "Invalid");
        }
                                               
    }                
    } 
