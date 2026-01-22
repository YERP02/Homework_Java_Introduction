/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flowerbedcalculator;

import java.util.Locale;
import java.util.Scanner;



public class FlowerBedCalculator {

    
    public static void main(String[] args) {
        int radius;
        double perimeter, area;
        Scanner scan = new Scanner(System.in);
        scan = scan.useLocale(Locale.US);
        
        //pedir los datos
        System.out.println("Ingresa la radio: ");
        radius = scan.nextInt();
        
        //Hacemos los calculos del area y perimetro
        perimeter = 2* Math.PI* radius;
        area = Math.PI * radius* radius;
        
        //Mosteamos los resultados
        System.out.println("El perimetro es: "+ perimeter);
        System.out.println("El area es: "+ area);
        
        
        
    }
    
}
