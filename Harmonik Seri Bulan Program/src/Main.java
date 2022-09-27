import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double toplam = 0;

        System.out.print("Bir sayi giriniz : ");
        double sayi = input.nextInt();

        for (double i = 1; i <= sayi; i++) {
            toplam += (1 / i);
        }
        System.out.println(sayi + " sayisinin harmonik seri toplami : " + toplam);
    }
}