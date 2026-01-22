/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userinfo;

import java.util.Locale;
import java.util.Scanner;

public class UserInfo {

    
    public static void main(String[] args) {
        String name, address;
        Scanner scan = new Scanner(System.in);
        
        //pedir los datos
        System.out.println("What is your name? ");
        name = scan.nextLine();
        System.out.println("Where do you live, [name]?");
        address = scan.nextLine();
        
        //Mostramos los datos
        System.out.println("Name: "+ name+ ", Address: "+address);
        
        
    }
    
}
