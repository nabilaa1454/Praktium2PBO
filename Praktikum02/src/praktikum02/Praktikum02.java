/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum02;

/**
 *
 * @author Nabilaa Noor'Aini K3519061
 */
public class Praktikum02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi*/
        KegalauanPakBejo ka = new KegalauanPakBejo();
        ka.ukuran = 30 * 30;
        ka.perbox = 10;
        ka.harga = 54000;
        System.out.println ("Ukuran Keramik A: " + ka.keramik() + "satuan luas");
        System.out.println ("Jumlah Box A: " + ka.box() + "box");
        System.out.println ("Harga Keramik A: " + ka.harga() + "rupiah");
        
        KegalauanPakBejo kb = new KegalauanPakBejo();
        kb.ukuran = 40 * 40;
        kb.perbox = 5;
        kb.harga = 65000;
        System.out.println ("Ukuran Keramik B: " + kb.keramik() + "satuan luas");
        System.out.println ("Jumlah Box B: " + kb.box() + "box");
        System.out.println ("Harga Keramik B: " + kb.harga() + "rupiah");
        
        KegalauanPakBejo kc = new KegalauanPakBejo();
        kc.ukuran = 40 * 30;
        kc.perbox = 8;
        kc.harga = 60000;
        System.out.println ("Ukuran Keramik C: " + kc.keramik() + "satuan luas");
        System.out.println ("Jumlah Box C: " + kc.box() + "box");
        System.out.println ("Harga Keramik C: " + kc.harga() + "rupiah");       
    }
    
}
