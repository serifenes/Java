import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int sayi = input.nextInt();

        for(int i = 0 ; i <= sayi ; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}