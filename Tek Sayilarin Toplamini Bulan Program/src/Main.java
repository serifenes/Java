import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam = 0;

        while (true) {
            System.out.print("Sayi giriniz(negatif sayi girdiginizde program sonlandirilir) : ");
            int sayi = input.nextInt();

            if (sayi % 2 == 1) {
                toplam += sayi;
            } else if (sayi < 0) {
                System.out.println("Program sonlandirildi...");
                break;
            }
        }
        System.out.println("Toplam : " + toplam);
    }
}
