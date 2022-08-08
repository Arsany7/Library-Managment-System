/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.student;

import Project.home.Student;
import static Project.student.StudentRW.ReadStdFile;
import static Project.student.StudentRW.getS;
import javax.swing.JOptionPane;

/**
 *
 * @author MOUSTFA
 */
public class StudentLogin extends Project.home.xxLoginAbs {
     public StudentLogin(){
        super();
        jLabel3.setText("Student Login");
        
        
     } 
    @Override
    protected void login()
    {      
     ReadStdFile();
       String usernamee = username.getText();
       String password = pass.getText();
       boolean found = false;
        for (int i = 0; i <Student.getNum(); i++) {
            
            if (getS()[i].getName().equals(usernamee) && getS()[i].getPassword().equals(password)) {
                found = true;
                JOptionPane.showMessageDialog(this, "Welcome");
                this.hide();
                StudentView f =new StudentView(usernamee);
                f.setVisible(true);
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, "Invalid");
        }
    }             
    
}
