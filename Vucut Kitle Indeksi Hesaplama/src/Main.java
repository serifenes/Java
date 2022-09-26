import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu(metre cinsinden) giriniz : ");
        double boy = input.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();

        double indeks = (kilo / (boy * boy));

        System.out.println("Vucut Kitle Indeksiniz : " + indeks);
    }
}
