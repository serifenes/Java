import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double toplam = 0;
        double sayac = 0;

        System.out.print("Bir sayi giriniz : ");
        int sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayac++;

            } else if (i % 3 == 0) {
                toplam += i;
                sayac++;
            } else if (i % 4 == 0) {
                toplam += i;
                sayac++;
            }
        }
        double ortalama = (toplam / sayac);

        System.out.println("Ortalama : " + ortalama);
    }
}
