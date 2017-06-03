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
public class Labalaba {
    public void tampilkanlaba(){
        System.out.println("Ini Kelas Laba-laba");
	Hewan hwn = new Hewan();
	hwn.setKulit("Bulu Halus dan Gelatin");
	System.out.println("Hewan ini ditutupi oleh : "+hwn.getKulit());
        hwn.setJumlahkaki(8);
	System.out.println("Hewan ini memiliki jumlah kaki : "+hwn.getJumlahkaki());
        hwn.setJenis("Insecta");
        System.out.println("Hewan ini termasuk jenis : "+hwn.getJenis());
}  
}
