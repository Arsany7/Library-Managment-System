/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.home;

/**
 *
 * @author MOUSTFA
 */
public class Student extends userAbs {
    
    private int nBooks;
    private  int  id;
    private int penalty;

    public Student(String name, int id, String password, String Email, String Address, String City, String Contactno,int nBooks, int penalty) {
        super(name, password, Email, Address, City, Contactno);
        this.nBooks = nBooks;
        this.id = id;
        this.penalty = penalty;
    }

    public int getnBooks() {
        return nBooks;
    }

    public void setnBooks(int nBooks) {
        this.nBooks = nBooks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }
    
}
