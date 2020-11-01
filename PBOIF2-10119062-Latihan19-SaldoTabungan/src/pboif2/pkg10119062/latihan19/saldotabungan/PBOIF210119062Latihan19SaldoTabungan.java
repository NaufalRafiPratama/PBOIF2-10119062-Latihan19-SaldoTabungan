/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan19.saldotabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * saldo tabungan
 */
public class PBOIF210119062Latihan19SaldoTabungan {

    public static void tampilSaldo(double saldoAwal,int bunga, int lamaBulan) {
        // TODO code application logic here
        int i = 1;
        double saldoSementara = saldoAwal;
        
        DecimalFormat kursID = (DecimalFormat) 
                DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol(" Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursID.setDecimalFormatSymbols(formatRp);
        
        while(i !=lamaBulan){
            System.out.println("Saldo di bulan ke-" + i + kursID.format
            (saldoSementara = saldoSementara + (saldoSementara *bunga/100)));
            i++;
        }
    }
    public static void main(String[] args) {
        
        double saldoAwal;
        int bunga, lamaBulan;
        
        saldoAwal = 2500000;
        bunga = 15;
        lamaBulan = 7;
        
        tampilSaldo(saldoAwal,bunga,lamaBulan);
    }
}
