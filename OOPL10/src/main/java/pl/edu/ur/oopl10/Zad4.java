/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Random;

/**
 *
 * @author Maciek
 */
public class Zad4 {

    public static void main(String[] args) {
        Random r = new Random();
        int p = 0;
        while (p < 3) {
            int a = r.nextInt(21) - 10;
            int b = r.nextInt(21) - 10;
            System.out.println("Dzielna " + a + ", Dzielnik " + b);
            try {
                int c = a / b;
                System.out.println("Wynik " + c);
            } catch (ArithmeticException e) {
                System.out.println("\nDzielenie przez 0\n");
                p++;
            }
        }
    }
}
