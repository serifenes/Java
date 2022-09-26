import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("1. kenari giriniz : ");
        int kenar1 = input.nextInt();
        System.out.print("2. kenari giriniz : ");
        int kenar2 = input.nextInt();
        System.out.print("3. kenari giriniz : ");
        int kenar3 = input.nextInt();

        double u = (double)((kenar1 + kenar2 + kenar3) / 2);

        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

        System.out.println(" Ucgenin Cevresi : " + (2 * u) + "\n Ucgenin alani : " + alan);

    }
}