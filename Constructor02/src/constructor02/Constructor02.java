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
public class Constructor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // instansiasi //
        KegalauanPakBejo2 kpb1 = new KegalauanPakBejo2(30 * 30, 10, 54000);
        kpb1.keramik();
        kpb1.box();
        kpb1.harga(); 
        
        KegalauanPakBejo2 kpb2 = new KegalauanPakBejo2(40 * 40, 5, 65000);
        kpb2.keramik();
        kpb2.box();
        kpb2.harga();
        
        KegalauanPakBejo2 kpb3 = new KegalauanPakBejo2(40 * 30, 8, 60000);
        kpb3.keramik();
        kpb3.box();
        kpb3.harga();       
    }
    
}
