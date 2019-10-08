/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan20.targetsaldotabungan;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan mengjitung target saldo tabungan
 * 
 */
public class PBO11K10118907Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo, saldo_awal = 3500000, bunga = 8, saldo_target = 6000000;
        
        saldo(saldo_awal, saldo_target, bunga);
        
    }
    
    public static void saldo(int saldo_awal, int saldo_target, int bunga) {
        int saldo2, saldo_akhir = saldo_awal, i=1;
        
        do {
            saldo2 = saldo_akhir * bunga/100;
            saldo_akhir += saldo2;
            System.out.println("Saldo dibulan ke-"+i+" Rp"+String.format("%,d", saldo_akhir).replace(",", "."));
            i++;
        } while(saldo_akhir < saldo_target);
    
    }
    
}
