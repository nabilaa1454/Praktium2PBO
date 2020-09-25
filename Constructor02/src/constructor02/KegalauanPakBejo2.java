/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor02;

/**
 *
 * @author Nabilaa Noor'Aini K3519061
 */
public class KegalauanPakBejo2 {
    /* atribut */
    int ukuran;
    int perbox;
    int harga;
    
    // constructor //
    KegalauanPakBejo2(int u, int b, int h){
        this.ukuran = u;
        this.perbox = b;
        this.harga = h;
    }
    // method //
    int keramik(){
        int luasKeramik = 1000000 / this.ukuran;
        return luasKeramik;
    }
    int box(){
        int jumlahBox = this.keramik() / this.perbox;
        return jumlahBox;
    }
    void harga(){
        int totalHarga =  this.box()* harga;
        System.out.println ("luas keramik: " + this.keramik() + "satuan luas");
        System.out.println ("box yang dibutuhkan sebanyak: " + this.box() + "box");
        System.out.println ("harga yang harus dibayar:" + totalHarga + "rupiah");
    }
}
