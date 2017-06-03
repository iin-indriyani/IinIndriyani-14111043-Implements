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
public class Gajah {
    public void tampilkangajah(){
        System.out.println("Ini Kelas Gajah");
	Hewan hwn = new Hewan();
	hwn.setKulit("Kulit Keras");
	System.out.println("Hewan ini ditutupi oleh : "+hwn.getKulit());
        hwn.setJumlahkaki(4);
	System.out.println("Hewan ini memiliki jumlah kaki : "+hwn.getJumlahkaki());
        hwn.setJenis("Mamalia");
        System.out.println("Hewan ini termasuk jenis : "+hwn.getJenis());
} 
}
