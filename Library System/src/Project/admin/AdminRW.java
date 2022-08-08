/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.admin;


import Project.home.Admin;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author MOUSTFA
 */
public class AdminRW {
    private static Admin A[] = new Admin[100]; 

    
   public static void ReadAdminFile() throws FileNotFoundException {
        int count=0;
         File F = new File("AdminsInfo.txt");
        Scanner s = new Scanner(F);
        while (s.hasNextLine()) {
            String x = s.nextLine();
            String tokens[] = x.split(",");
            A[count++] = new Admin(tokens[0], tokens[1]);     
        }
        Admin.setNum(count);
         }
   
      public static Admin[] getA() {
        return A;
      }
}
