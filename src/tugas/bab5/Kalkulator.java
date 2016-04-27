package Praktikum.bab5;

public class Kalkulator {

    private double a, b;

    public Kalkulator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static void jumlah(double c, double d) {
        double j = c + d;
        System.out.printf("%s %.0f %s", "Hasil penjumlahan\t= ", j, "\n");
    }

    public static void kurang(double c, double d) {
        double k = c - d;
        System.out.printf("%s %.0f %s", "Hasil pengurangan\t= ", k, "\n");
    }

    public void kali() {
        double l = a * b;
        System.out.printf("%s %.0f %s", "Hasil perkalian\t= ", l, "\n");
    }

    public void bagi() {
        double m = a / b;
        System.out.printf("%s %.1f %s", "Hasil pembagian\t=", m, "\n");
    }

    public void sederhana(int h, int j) {
        for (int b = h; b > 0; b--) {

            int g = h % b;
            if (g == 0) {
                int i = j % b;
                if (i == 0) {
                    int m = h / b;
                    int n = j / b;
                    System.out.println("Penyederhanaan  = " + m + "/" + n);
                    break;
                }
            }
        }
    }
}
