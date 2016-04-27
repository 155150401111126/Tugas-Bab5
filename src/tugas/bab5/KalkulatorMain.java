package Praktikum.bab5;
import java.util.Scanner;
public class KalkulatorMain {
    
    public static void main(String[] args) {
        
        Scanner puta = new Scanner (System.in);
        
        System.out.print("Masukkan bilangan pertama     : ");
        double a = puta.nextInt();
        System.out.print("Masukkan bilangan kedua       : ");
        double b = puta.nextInt();
        System.out.println("-------------------------------------------------");
        Kalkulator.jumlah(a, b);
        Kalkulator.kurang(a, b);
        
        Kalkulator satu = new Kalkulator (a,b);
        satu.kali();
        satu.bagi();
        
        System.out.println("\n---Penyederhanaan pecahan---");
        System.out.print("Masukkan pembilang    = ");
        int c = puta.nextInt();
        System.out.print("Masukkan penyebut     = ");
        int d = puta.nextInt();
        satu.sederhana(c, d);
        
    }
    
}
