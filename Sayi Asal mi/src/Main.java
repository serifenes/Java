import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean asalMi = true;

        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = input.nextInt();

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
            }
        }
        if (asalMi) {
            System.out.println(sayi + " sayisi asaldir");
        } else {
            System.out.println(sayi + " sayisi asal degildir");
        }
    }
}