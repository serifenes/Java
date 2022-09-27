import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi (km cinsinden) giriniz : ");
        double mesafe = input.nextDouble();
        System.out.print("Yasinizi giriniz : ");
        int yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz(1 -> tek yon , 2 -> gidis-donus) : ");
        int tip = input.nextInt();

        double fiyat = (mesafe * 0.10);
        double geciciFiyat = fiyat;

        if(mesafe < 0 || yas <= 0 ){
            System.out.println("Hatali Veri Girdiniz!");
        }
        else{
            if(tip == 1 || tip == 2){
                if(yas <= 12){
                    double indirim = (geciciFiyat / 2);
                    fiyat -= indirim;
                }
                 if(yas > 12 && yas < 24){
                    double indirim = (geciciFiyat / 10);
                        fiyat -= indirim;
                    }
                 if(yas > 65){
                    double indirim = ((geciciFiyat * 3) / 10);
                    fiyat -= indirim;
                }
                if(tip == 2){
                    double indirim = (geciciFiyat / 5);
                    fiyat -= indirim;
                }
            else{
                System.out.println("Hatali Veri Girdiniz!");
            }
            }
            System.out.println("Fiyat : " + fiyat);
        }
    }
}
