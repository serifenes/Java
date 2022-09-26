import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yaricapini giriniz : ");
        double yaricap = input.nextInt();

        double cevre = (2 * yaricap * Math.PI);
        double alan = (Math.PI * yaricap * yaricap);

        System.out.println(" Cevre : " + cevre + "\n Alan : " + alan);
    }
}