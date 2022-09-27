import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam1 = 0;
        int toplam2 = 0;

        System.out.print("1. sayiyi giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        int sayi2 = input.nextInt();

        for(int i = 1 ; i < sayi1 ; i++){
            if(sayi1 % i == 0){
                toplam1 += i;
            }
        }
        for(int i = 1 ; i < sayi2 ; i++){
            if(sayi2 % i == 0){
                toplam2 += i;
            }
        }
        if(sayi1 == toplam2){
            if(sayi2 == toplam1){
                System.out.println(sayi1 + " ve " + sayi2 + " arkadas sayilardir");
            }
            else{
                System.out.println(sayi1 + " ve " + sayi2 + " arkadas sayi degil");
            }
        }
        else{
            System.out.println(sayi1 + " ve " + sayi2 + " arkadas sayi degil");
        }
    }
}
