package Praktikum.bab5;

public class Jaket {

    public final int A = 100000, B = 125000, C = 175000;
    private int hrg;

    public Jaket(int b, int a) {
        switch (b) {
            case 1:
                if (a > 100) {
                    hrg = a * 95000;
                } else {
                    hrg = a * A;
                }
                break;
            case 2:
                if (a > 100) {
                    hrg = a * 120000;
                } else {
                    hrg = a * B;
                }
                break;
            case 3:
                if (a > 100) {
                    hrg = a * 160000;
                } else {
                    hrg = a * C;
                }
                break;
        }
    }

    public int getHrg() {
        return hrg;
    }
}
