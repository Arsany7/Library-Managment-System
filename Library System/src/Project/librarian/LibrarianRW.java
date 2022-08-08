/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.librarian;

import Project.home.Librarian;
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
public class LibrarianRW {
    private static Librarian L[]=new Librarian[100];
    
    
    
    public static void ReadLibFile()
    {
        int count=0;
     File F = new File("LibrariansInfo.txt");
        Scanner s = null;
    try { 
        s = new Scanner(F);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(LibrarianRW.class.getName()).log(Level.SEVERE, null, ex);
    }
         
        while (s.hasNextLine()) {
            
            String x = s.nextLine();
            String tokens[] = x.split(",");
            L[count++]=new Librarian(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5]);
        } 
        
        Librarian.setNum(count);
    
    }
     public  static void WriteLib(String Store,boolean last) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("LibrariansInfo.txt", true);
            PrintWriter pw = new PrintWriter(fileWriter);
            if (last == true)
                pw.println(Store);
            else
                pw.print(Store + ",");
        } catch (IOException ex) {
            Logger.getLogger(LibrarianRW.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(LibrarianRW.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
}
      public static Librarian[] getL() {
        return L;
    }
}
