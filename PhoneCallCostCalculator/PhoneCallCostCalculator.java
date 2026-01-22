/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phonecallcostcalculator;

import java.util.Scanner;

public class PhoneCallCostCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c1,c2,c3, t1,t2,t3, cost1, cost2, cost3 , totalCost;
        Scanner scan = new Scanner(System.in);
        
        //Pedir los datos
        System.out.println("Ingresa el costo por minuto de la primer llamada: ");
        c1 = scan.nextInt();
        System.out.println("Ingrese le costo por minuto de la segunda llamada: ");
        c2 = scan.nextInt();
        System.out.println("Ingrese el costo por minuto de la tercer llamada: ");
        c3 = scan.nextInt();
        
        System.out.println("Ingrese la duración de la primer llamada: ");
        t1 = scan.nextInt();
        System.out.println("Ingrese la duración de la segunda llamada: ");
        t2 = scan.nextInt();
        System.out.println("Ingrese la duración de la tercer llamada: ");
        t3 = scan.nextInt();
        
        //calcular los coste de cada llamada
        cost1 = c1 * t1;
        cost2 = c2 * t2;
        cost3 = c3 * t3;
        totalCost = cost1 + cost2 + cost3;
        
        //Mostrar el costo de cada llamada
        System.out.println("La primera llamada costo: "+cost1);
        System.out.println("La segunda llamada costo: "+cost2);
        System.out.println("La tercer llamada costo: "+ cost3);
        System.out.println("El costo total de las llamadas fue: "+ totalCost);
        
        
    }
    
}
