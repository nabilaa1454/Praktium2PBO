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
public class KegalauanPakBejo {
    /* membuat methods */
    int ukuran;
    int perbox;
    int harga;
    
    int keramik(){
        int luasKeramik = 1000000 / this.ukuran;
        return luasKeramik;
    }
    int box(){
        int jumlahBox = this.keramik() / this.perbox;
        return jumlahBox;
    }
    int harga(){
        int totalHarga =  this.box()* harga;
        return totalHarga;   
    }  
}
