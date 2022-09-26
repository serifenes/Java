import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Sicaklik giriniz : ");
        int sicaklik = input.nextInt();

        if(sicaklik <= 5){
            System.out.println("Tam kayak yapmalik hava :)");
        }
        else if(sicaklik > 5 && sicaklik <= 15){
            System.out.println("Sinemaya gitmeye ne dersin ?");
        }
        else if(sicaklik > 15 && sicaklik <= 25){
            System.out.println("Bir piknik cok iyi gider");
        }
        else if(sicaklik > 25){
            System.out.println("Biraz yuzerek serinleyebilirsin");
        }

    }
}
