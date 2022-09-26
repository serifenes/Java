import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen gidilen mesafeyi km cinsinden giriniz : ");
        int km = input.nextInt();

        double tutar = ((km * 2.20) + 10);

        if(tutar < 20){
            System.out.println("Tutar : 20 TL");
        }
        else{
            System.out.println("Tutar : " + tutar);
        }
    }
}
