/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author student
 */
public class Zad3 {
    public static void dzielenie() {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.err.println("Dzielenie przez 0");
        }
    }
}
