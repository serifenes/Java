import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int sayi = input.nextInt();

        int geciciSayi = sayi;
        int sayac = 0;
        int toplam = 0;

        while (geciciSayi != 0) {
            geciciSayi /= 10;
            sayac++;
        }
        geciciSayi = sayi;

        while (geciciSayi != 0) {
            int geciciDeger = geciciSayi % 10;
            int basamakToplam = 1;

            for (int i = 1; i <= sayac; i++) {
                basamakToplam *= geciciDeger;
            }
            toplam += basamakToplam;
            geciciSayi /= 10;
        }
        if (toplam == sayi) {
            System.out.println(sayi + " sayisi bir armstrong sayidir");
        } else {
            System.out.println(sayi + " sayisi armstrong sayi degildir");
        }
    }
}