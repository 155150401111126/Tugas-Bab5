package Praktikum.bab5;
import java.util.*;
public class JaketMain {
    public static void main(String[] args) {
        Scanner puta=new Scanner(System.in);
        
        System.out.println("------------CV Labkomdas------------");
        System.out.println("Pilihan : \n1.Jaket A\n2.Jaket B\n3.Jaket C");
        System.out.print("Pesanan anda : ");
        int pilih=puta.nextInt();
        System.out.print("Jumlah pemesanan : ");
        int j = puta.nextInt();
        Jaket satu = new Jaket(pilih, j);
        System.out.println("Total pembayaran = Rp."+satu.getHrg());
        
    }
}
