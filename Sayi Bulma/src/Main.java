import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        boolean varMi = false;

        int dizi [] = {1,2,3,4,5,6,7,5,435,32,1,94};

        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = input.nextInt();

        for(int i = 0 ; i < dizi.length ; i++){
            if(sayi == dizi[i]){
                varMi = true;
            }
        }
        if(varMi){
            System.out.println(sayi + " dizide mevcuttur");
        }
        else{
            System.out.println(sayi + " dizide mevcut degildir");
        }
    }
}