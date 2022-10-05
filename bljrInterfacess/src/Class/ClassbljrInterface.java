/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import interfaces.interfacebljrInterfacess;

/**
 *
 * @author user
 */
public class ClassbljrInterface implements interfacebljrInterfacess {
    private double phi = 3.14;
    private double rumus = 3;
    @Override
    public void hitungvolumeKerucut(double jari, double tinggi) {
        double hasil = phi * jari * jari * tinggi / rumus;
        System.out.println(hasil);
    }
    
}
