import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double kdvTutari;

        System.out.print("Lutfen miktar giriniz : ");
        int miktar = input.nextInt();

        if(miktar > 1000){
            kdvTutari = (miktar * 8) / 100;
        }
        else{
            kdvTutari = (miktar * 18) / 100;
        }
        System.out.println(" Kdv tutari = " + kdvTutari + "\n Kdv tutari olmadan miktar = " + miktar +
                "\n Kdv tutarli miktar = " + (miktar + kdvTutari));

    }
}