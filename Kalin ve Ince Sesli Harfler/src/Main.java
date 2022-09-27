import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir harf giriniz : ");
        String harf = input.nextLine();

        switch (harf) {
            case "a":
            case "ı":
            case "o":
            case "u":
                System.out.println("Kalin sesli harftir");
                break;
            case "e":
            case "i":
            case "ö":
            case "ü":
                System.out.println("Ince sesli harftir");
                break;
            default:
                System.out.println("Lutfen gecerli bir karakter giriniz");
        }
    }
}