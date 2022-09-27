import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int sonuc = 1;

        System.out.print("Bir sayi giriniz : ");
        int sayi = input.nextInt();

        for(int i = 1 ; i <= sayi ; i++){
            sonuc *= i;
        }
        System.out.println("Faktoriyeli : " + sonuc);
    }
}