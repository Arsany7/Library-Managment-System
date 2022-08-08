/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.book;

import Project.home.Book;
import Project.home.IssuedBook;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MOUSTFA
 */
public class BookRW {
 private static Book B[] = new Book[100];
private static IssuedBook IB[] = new IssuedBook[100];

 public static void ReadBookFile() throws FileNotFoundException {
        int count=0;
         File F = new File("BooksInfo.txt");
        Scanner s = new Scanner(F);
        while (s.hasNextLine()) {
            String x = s.nextLine();
            String tokens[] = x.split(",");
             B[count++] = new Book(tokens[0], tokens[1],tokens[2],tokens[3],tokens[4],Integer.parseInt(tokens[5]),LocalDate.parse(tokens[6]));     
        }
        Book.setNumBooks(count);
        
     }
      
       public static void ReadIBookFile() throws FileNotFoundException {
        int count=0;
         File F = new File("IssuedBooksInfo.txt");
        Scanner s = new Scanner(F);
        while (s.hasNextLine()) {
            String x = s.nextLine();
            String tokens[] = x.split(",");
             IB[count++] = new IssuedBook(tokens[0], tokens[1],tokens[2],tokens[3],LocalDate.parse(tokens[4]));     
        }
        IssuedBook.setNumBooks(count);
        
     }
       
        public  static void WriteBook(String Store,boolean last) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("BooksInfo.txt", true);
            PrintWriter pw = new PrintWriter(fileWriter);
            if (last == true)
                pw.println(Store);
            else
                pw.print(Store + ",");
        } catch (IOException ex) {
            Logger.getLogger(BookRW.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(BookRW.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
}
        public  static void WriteIssuedBook(String Store,boolean last) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("IssuedBooksInfo.txt", true);
            PrintWriter pw = new PrintWriter(fileWriter);
            if (last == true)
                pw.println(Store);
            else
                pw.print(Store + ",");
        } catch (IOException ex) {
            Logger.getLogger(BookRW.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(BookRW.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
}
        public  static void WriteBookARR(){
        File f = new File("BooksInfo.txt");
                     PrintWriter pw = null;
                
                try {
                    pw = new PrintWriter(f);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
                }
              
               for (int j = 0; j < Book.getNumBooks();j++) {
                   pw.println(getB()[j].getCallno() +","+
                           getB()[j].getName()+","+
                           getB()[j].getAuthor()+","+
                           getB()[j].getPublisher()+","+
                           getB()[j].getQuantity()+","+
                           getB()[j].getIssued()+","+
                           getB()[j].getDa());
                }
                pw.close();
        }
        public  static void WriteIBookARR(){
        File f = new File("IssuedBooksInfo.txt");
                     PrintWriter pw = null;
                
                try {
                    pw = new PrintWriter(f);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
                }
              
               for (int j = 0; j < IssuedBook.getNumBooks();j++) {
                   pw.println(getIB()[j].getCallno() +","+
                          getIB()[j].getStdID()+","+
                           getIB()[j].getStdName()+","+
                           
                           getIB()[j].getStdContact()+","+
                           getIB()[j].getDi());
                           }
                           
                pw.close();
        }
        
         public static Book[] getB() {
        return B;
    }

    public static IssuedBook[] getIB() {
        return IB;
    }

}
