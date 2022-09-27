import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam = 0;

        while (true) {
            System.out.print("Bir sayi giriniz : ");
            int sayi = input.nextInt();

            if (sayi % 4 == 0) {
                toplam += sayi;
            } else if (sayi % 2 == 1) {
                System.out.println("Toplam : " + toplam);
                System.out.println("Program sonlandiliyor...");
                break;
            }
        }
    }
}