import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sonuc = 1;

        System.out.print("Ussu alinacak sayiyi giriniz : ");
        int taban = input.nextInt();
        System.out.print("Ussu giriniz : ");
        int us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }
        System.out.println("Sonuc : " + sonuc);
    }
}
