/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcalculator;

import interfaces.interfacecalculator;

/**
 *
 * @author user
 */
public class classcalculator implements interfacecalculator {
    double hasil;
    @Override
    public void pertambahan(double a, double b) {
         hasil = a + b;
         System.out.println("hasilnya adalah :"+hasil);
    }

    @Override
    public void pengurangan(double a, double b) {
         hasil = a - b;
         System.out.println("hasilnya adalah :"+hasil);
    }

    @Override
    public void perkalian(double a, double b) {
         hasil = a * b;
         System.out.println("hasilnya adalah :"+hasil);
    }

    @Override
    public void pembagian(double a, double b) {
         hasil = a / b;
         System.out.println("hasilnya adalah :"+hasil);
    }
    
}
