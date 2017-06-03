/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.Implement;

/**
 *
 * @author iin
 */
public class Ayamnegeri implements Ayam {
    
    @Override
    public void ukuran() {
        System.out.println("Ayam ini memiliki ukuran : besar, bulat");
    }

    @Override
    public void makanan() {
        System.out.println("Ayam ini memakan : dedak, cacing");
    }

    @Override
    public void warna() {
        System.out.println("Ayam ini memiliki warna : merah, hitam, putih");
    }
}
