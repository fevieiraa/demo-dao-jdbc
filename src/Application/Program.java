/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.util.Date;
import model.entities.Department;
import model.entities.Seller;


public class Program {
    
    public static void main (String[]args ){
    
        Department obj = new Department(1,"booksca");
        
        Seller seller = new Seller(21,"ca","cafe@gmail.com", new Date(), 3000.0, obj);
        
        System.out.println(seller);
    }
}
