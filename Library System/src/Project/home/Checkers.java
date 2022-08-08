/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.home;

import Project.student.StudentRW;
import static Project.student.StudentRW.getS;
import javax.swing.JOptionPane;
//import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author MOUSTFA
 */
public class Checkers {
   
    
    public static boolean ContactNoValidation (String number)
    {
        int length = number.length();            
     
        for (int i = 0; i < length; i++)//Check if the contact consists of only digits.
        {
            if (!Character.isDigit(number.charAt(i))||(length<3)) 
            {
               JOptionPane.showMessageDialog(null,"Invalid contact number!");
               return false;
            }
        }
       return true; 
    }
    public static boolean EmailValidation (String email) 
    {
       boolean valid = true;
       if(!valid)
           JOptionPane.showMessageDialog(null,"Invalid Email!");
        return valid;
        
        } 
    public static boolean isValidId (String id)
    { 
        Project.student.StudentRW.ReadStdFile();
        for (int i = 0; i < id.length(); i++)
        {
            if (!Character.isDigit(id.charAt(i))) //Check if the id consists of only characters.
            {
               JOptionPane.showMessageDialog(null,"Invalid ID! (Only digits are allowed)");
               return false;
               
            }
        }
        for (int i = 0; i < Student.getNum(); i++)//Check that the id is unique.
        {
            if (Integer.parseInt(id) == getS()[i].getId())
            {
                JOptionPane.showMessageDialog(null,"This ID already exists!");
                return false;
            }
        }
       return true; 
    }   
    public static boolean isNull (String x)
    {
        if(x.equals("")){
            JOptionPane.showMessageDialog(null,"Fields cannot be empty");
             return true;
        }
           
        else return false;
    }
 
    public static boolean isInt(String x)
    {boolean integer=true;
          for (int i = 0; i < x.length(); i++)
        {
            if (!Character.isDigit(x.charAt(i))) //Check if the id consists of only characters.
            {
               JOptionPane.showMessageDialog(null,"Invalid Quantity! (Only digits are allowed)");
               integer=false;
               break;
            }
            
        }
          return integer;
    }
    public static boolean isIntid(String x)
    {boolean integer=true;
          for (int i = 0; i < x.length(); i++)
        {
            if (!Character.isDigit(x.charAt(i))) //Check if the id consists of only characters.
            {
               JOptionPane.showMessageDialog(null,"Invalid ID! (Only digits are allowed)");
               integer=false;
               break;
            }
            
        }
          return integer;
    }
}
