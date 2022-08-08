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
public class IssuedBook {
    private String callno;
    private String stdName;
    private String stdID;
    private String stdContact;
    private LocalDate di;
    private static int  numBooks;

    public IssuedBook(String callno,  String stdID,String stdName, String stdContact, LocalDate di) {
        this.callno = callno;
        this.stdName = stdName;
        this.stdID = stdID;
        this.stdContact = stdContact;
        this.di = di;
    }

    public String getCallno() {
        return callno;
    }

    public void setCallno(String callno) {
        this.callno = callno;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public String getStdContact() {
        return stdContact;
    }

    public void setStdContact(String stdContact) {
        this.stdContact = stdContact;
    }

    public LocalDate getDi() {
        return di;
    }

    public void setDi(LocalDate di) {
        this.di = di;
    }

    public static int getNumBooks() {
        return numBooks;
    }

    public static void setNumBooks(int numBooks) {
        IssuedBook.numBooks = numBooks;
    }
    
}
