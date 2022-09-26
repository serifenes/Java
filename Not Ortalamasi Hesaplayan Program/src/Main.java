import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        int matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        int fizik = input.nextInt();
        System.out.print("Turkce notunuzu giriniz : ");
        int turkce = input.nextInt();
        System.out.print("Muzik notunuzu giriniz : ");
        int muzik = input.nextInt();
        System.out.print("tarih notunuzu giriniz : ");
        int tarih = input.nextInt();

        double ortalama = (double)(matematik + fizik + turkce + muzik + tarih) / 5;

        if(ortalama >= 60){
            System.out.println("Tebrikler gectiniz. Ortalamaniz : " + ortalama);
        }
        else{
            System.out.println("Kaldiniz. Ortalamaniz : " + ortalama);
        }
    }
}
