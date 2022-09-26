import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen 1. sayiyi giriniz : ");
        double sayi1 = input.nextInt();
        System.out.print("Lutfen 2. sayiyi giriniz : ");
        double sayi2 = input.nextInt();


        System.out.println("1 -> toplama \n2-> cikarma \n3-> carpma \n4-> bolme");

        System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
        int islem = input.nextInt();

        if (islem == 1) {
            System.out.println("Sonuc : " + (sayi1 + sayi2));
        } else if (islem == 2) {
            System.out.println("Sonuc : " + (sayi1 - sayi2));
        } else if (islem == 3) {
            System.out.println("Sonuc : " + (sayi1 * sayi2));
        } else if (islem == 4) {
            System.out.println("Sonuc : " + (sayi1 / sayi2));
        } else {
            System.out.println("Gecersiz islem sectiniz");
        }
    }
}