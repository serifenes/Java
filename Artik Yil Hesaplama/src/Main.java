import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Yil giriniz : ");
        int yil = input.nextInt();

        if(yil % 4 == 0){
            if(yil % 100 == 0){
                if(yil % 400 == 0){
                    System.out.println(yil + " artik yildir");
                }
                else{
                    System.out.println(yil + " artik yil degildir");
                }
            }
            else{
                System.out.println(yil + " artik yildir");
            }
        }
        else{
            System.out.println(yil + " artil yil degildir");
        }
    }
}