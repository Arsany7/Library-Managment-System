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
public abstract class  userAbs {
    private String name;
    private String password;
    private String Email;
    private String Address;
    private String City;
    private String Contactno;
    private static int num;
    public userAbs(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public userAbs(String name, String password, String Email, String Address, String City, String Contactno) {
        this.name = name;
        this.password = password;
        this.Email = Email;
        this.Address = Address;
        this.City = City;
        this.Contactno = Contactno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getContactno() {
        return Contactno;
    }

    public void setContactno(String Contactno) {
        this.Contactno = Contactno;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        userAbs.num = num;
    }
    
    
}
