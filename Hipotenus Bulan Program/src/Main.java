import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("1. kenar uzunlugunu giriniz : ");
        int kenar1 = input.nextInt();
        System.out.print("2. kenar uzunlugunu giriniz : ");
        int kenar2 = input.nextInt();

        double hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

        System.out.println("Hipotenus : " + hipotenus);
    }
}
