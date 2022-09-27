import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayiyi giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        int sayi2 = input.nextInt();
        System.out.print("3. sayiyi giriniz : ");
        int sayi3 = input.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            if (sayi2 > sayi3) {
                System.out.print(sayi1 + " > " + sayi2 + " > " + sayi3);
            } else {
                System.out.print(sayi1 + " > " + sayi3 + " > " + sayi2);
            }
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            if (sayi1 > sayi3) {
                System.out.println(sayi2 + " > " + sayi1 + " > " + sayi3);
            } else {
                System.out.println(sayi2 + " > " + sayi3 + " > " + sayi1);
            }
        } else {
            if (sayi1 > sayi2) {
                System.out.println(sayi3 + " > " + sayi1 + " > " + sayi2);
            } else {
                System.out.println(sayi3 + " > " + sayi2 + " > " + sayi1);
            }
        }
    }
}