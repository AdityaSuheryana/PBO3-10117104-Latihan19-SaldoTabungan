/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan19.saldotabungan;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author
 * Nama      : Aditya Suheryana
 * Kelas     : IF-3/PBO3
 * NIM       : 10117104
 * Deskripsi : Menampilkan Program Saldo tabungan berdasarkan target Lama bulan
 */
public class PBO310117104Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int bunga,bulan;
        double total,saldoAwal;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Saldo Awal        : Rp. ");
        saldoAwal=scn.nextDouble();
        System.out.print("Bunga/Bulan(%)    : ");
        bunga=scn.nextInt();
        System.out.print("Lama (bulan)      : ");
        bulan=scn.nextInt();
        
                for (int i=1;i<=bulan;i++){      
            total=(bunga*0.01*saldoAwal+saldoAwal);
            DecimalFormat df = new DecimalFormat("#,###,###");
            System.out.println("Saldo di bulan ke-"+i+" Rp. "+df.format(Math.floor(total)));
           
           saldoAwal=total;
    }
    }
    
}
