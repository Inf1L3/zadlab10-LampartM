/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.*;

public class WprowadzZKonsoli {
    Scanner input = new Scanner(System.in);
    
    public static void wprowadzInt(){
         Scanner input = new Scanner(System.in);
        int x;
        try{
        System.out.println("Podaj liczbe calkowita: ");
        x = input.nextInt();
        }
        catch(InputMismatchException e1){
            System.out.println("Podana liczba nie jest liczba calkowita.");
        }
    }
    public void wprowadzChar(){
        String x;
        try{
        System.out.println("Podaj pojedynczy znak: ");
        x = input.next();
        }
        catch(InputMismatchException e1){
            System.out.println("Podany pojedynczy znak jedy bledny.");
        }
    }
    public void wprowadzLong(){
        long x;
        try{
        System.out.println("Podaj liczbe calkowita long: ");
        x = input.nextLong();
        }
        catch(InputMismatchException e1){
            System.out.println("Podana liczba jest bledna.");
        }
    }
    public void wprowadzShort(){
        short x;
        try{
        System.out.println("Podaj liczbe calkowita short: ");
        x = input.nextShort();
        }
        catch(InputMismatchException e1){
            System.out.println("Podana liczba jest bledna.");
        }
    }
    public void wprowadzFloat(){
        float x;
        try{
        System.out.println("Podaj liczbe zmiennoprzecinkowa typu float: ");
        x = input.nextFloat();
        }
        catch(InputMismatchException e1){
            System.out.println("Podana liczba nie jest liczba zmiennoprzecinkowa typu float.");
        }
    }
    public void wprowadzDouble(){
        double x;
        try{
        System.out.println("Podaj liczbe zmiennoprzecinkowa typu double: ");
        x = input.nextDouble();
        }
        catch(InputMismatchException e1){
            System.out.println("Podana liczba nie jest liczba zmiennoprzecinkowa typu double.");
        }
    }
    public void wprowadzString(){
        String x;
        try{
        System.out.println("Podaj ciag znakow: ");
        x = input.nextLine();
        }
        catch(InputMismatchException e1){
            System.out.println("Podany ciag znakow jest bledny.");
        }
    }
    
}
