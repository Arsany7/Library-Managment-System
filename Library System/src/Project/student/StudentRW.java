/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.student;


import Project.home.Student;
import Project.book.IssueBook;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MOUSTFA
 */
public class StudentRW {
private static Student S[]=new Student[100];  
     public  static void WriteStd(String Store,boolean last) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("StudentsInfo.txt", true);
            PrintWriter pw = new PrintWriter(fileWriter);
            if (last == true)
                pw.println(Store);
            else
                pw.print(Store + ",");
        } catch (IOException ex) {
            Logger.getLogger(StudentRW.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(StudentRW.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
}
 public static void ReadStdFile()
    {
        
        int count=0;
       
     File F = new File("StudentsInfo.txt");
        Scanner s = null;
        try {
            s = new Scanner(F)  ;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentRW.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        while (s.hasNextLine()) {
            
            String x = s.nextLine();
            String tokens[] = x.split(",");
            S[count++]=new Student(tokens[0],Integer.parseInt(tokens[1]),tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],Integer.parseInt(tokens[7]),Integer.parseInt(tokens[8]));
            //S[count].getBorBooks()[0].setCallno(tokens[9]);
            //S[count].getBorBooks()[1].setCallno(tokens[10]);
            //S[count].getBorBooks()[2].setCallno(tokens[11]);
        } 
        
        Student.setNum(count);
       
    }   
 public  static void WriteStdARR(){
        File f = new File("StudentsInfo.txt");
                     PrintWriter pw = null;
                
                try {
                    pw = new PrintWriter(f);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
                }
              
               for (int j = 0; j < Student.getNum();j++) {
                   pw.println(getS()[j].getName()+","+
                           getS()[j].getId()+","+
                           getS()[j].getPassword()+","+
                           getS()[j].getEmail()+","+
                           getS()[j].getAddress()+","+
                           getS()[j].getCity()+","+
                           getS()[j].getContactno()+","+
                           getS()[j].getnBooks()+","+
                            getS()[j].getPenalty());
                           }
                           
                pw.close();
        }
        
        
    public static Student[] getS() {
        return S;
    }

 
}
