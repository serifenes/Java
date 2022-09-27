import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam = 0;

        System.out.print("Bir sayi giriniz : ");
        int sayi = input.nextInt();

        for(int i = 1 ; i <= sayi ; i++){
            if(sayi % i == 0){
                toplam += i;
            }
        }
        if(toplam / 2 == sayi){
            System.out.println(sayi + " sayisi mukemmel sayidir");
        }
        else{
            System.out.println(sayi + " sayisi mukemmel sayi degildir");
        }
    }
}
