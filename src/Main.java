import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int total = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Sayı: ");
        int sayi = in.nextInt();
        int x = sayi;

        boolean h = true;
        while (sayi != 0) {
            x =sayi;
            while (h) {
                x %= 10;
                total += x;
                h = false;
            }
            sayi /= 10;
            h = true;
        }
        System.out.println(total);
    }
}
