package oop.Implement;


/**
 *
 * @author iin
 */
public class Ayamkampung implements Ayam {
    
    @Override
    public void ukuran() {
        System.out.println("Ayam ini memiliki ukuran : kecil");
    }

    @Override
    public void makanan() {
        System.out.println("Ayam ini memakan : dedak");
    }

    @Override
    public void warna() {
        System.out.println("Ayam ini memiliki warna : merah, hitam, putih");
    }
}
