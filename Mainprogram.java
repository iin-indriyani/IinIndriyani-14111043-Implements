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
public class Mainprogram {
    public static void main (String[] args){
        
        Hewan hw = new Hewan();
            System.out.println("Ini Kelas Hewan");
    System.out.println("");
            
    
    Hewan a = new Hewan();
    System.out.println("Ini Kelas Ayam");
	a.setKulit("Bulu");
	System.out.println("Hewan ini ditutupi oleh : "+a.getKulit());
        a.setJumlahkaki(2);
	System.out.println("Hewan ini memiliki jumlah kaki : "+a.getJumlahkaki());
        a.setJenis("Unggas");
        System.out.println("Hewan ini termasuk jenis : "+a.getJenis());
    
            System.out.println("");

        Ayamkampung ak = new Ayamkampung();
        System.out.println("Ini Kelas Ayam Kampung Implement Kelas Ayam");
        ak.ukuran();
        ak.makanan();
        ak.warna();
        
            System.out.println("");

        Ayamnegeri an = new Ayamnegeri();
        System.out.println("Ini Kelas Ayam Negeri Implement Kelas Ayam");
        an.ukuran();
        an.makanan();
        an.warna();
        
            System.out.println("");

        Ayamhutan ac = new Ayamhutan();
        System.out.println("Ini Kelas Ayam Hutan Implement Kelas Ayam");
        ac.ukuran();
        ac.makanan();
        ac.warna();
        
            System.out.println("");
    
        Gajah gj = new Gajah();
        gj.tampilkangajah();
        
               System.out.println("");
    
        Labalaba lb = new Labalaba();
        lb.tampilkanlaba();
}
}