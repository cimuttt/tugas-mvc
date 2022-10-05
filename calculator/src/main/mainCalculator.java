/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classcalculator.classcalculator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class mainCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        classcalculator c = new classcalculator();
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        String x;
        System.out.print("nilai 1 :");
        a = sc.nextDouble();
        System.out.print("\nnilai 2 :");
        b = sc.nextDouble();
        System.out.print("\npilih operator(+, -, *, /, s(stop) : ");
        x = sc.next();
        while(!sc.hasNextBoolean()){
        x = sc.next();
        switch(x) {
            case "+":
                c.pertambahan(a, b);
                break;
            case "-":
                c.pengurangan(a, b);
                break;
            case "*":
                c.perkalian(a, b);
                break;
            case "/":
                c.pembagian(a, b);
                break;
            case "s":
                System.exit(0);
                break;
            default:
                System.out.println("anda tidak memilih salah 1 dari 4 operator, silahkan masukan operator yg sesuai");  
           }
        }
    }
}
