import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        /*
        Kullanıcıdan alınan 3 sayıdan en büyüğünü ekrana yazdıran program.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayiyi giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        int sayi2 = input.nextInt();
        System.out.print("3. sayiyi giriniz : ");
        int sayi3 = input.nextInt();

        System.out.println("En buyuk sayi : " + Math.max(sayi1 , Math.max(sayi2 , sayi3)));
    }
}
