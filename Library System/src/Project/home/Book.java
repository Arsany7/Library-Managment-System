/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.home;
import java.time.LocalDate;


/**
 *
 * @author MOUSTFA
 */
public class Book {
    private String callno;
    private String name;
    private String author;
    private String publisher;
    private String quantity;
    private static int  numBooks;
    private int issued;
    private LocalDate da;

    public Book(String callno, String name, String author, String publisher, String quantity,int issued,LocalDate DA) {
        this.callno = callno;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.issued=issued;
        this.da=DA;
    }   

    public Book() {
        
    }
    

    public String getCallno() {
        return callno;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getQuantity() {
        return quantity;
    }

    public static int getNumBooks() {
        return numBooks;
    }

    public static void setNumBooks(int numBooks) {
        Book.numBooks = numBooks;
    }

    public void setCallno(String callno) {
        this.callno = callno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getIssued() {
        return issued;
    }

    public void setIssued(int issued) {
        this.issued = issued;
    }

    public LocalDate getDa() {
        return da;
    }
    
}
