import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Dogum yilinizi giriniz : ");
        int dogumYili = input.nextInt();

        if(dogumYili % 12 == 0){
            System.out.print("Cin Zodyagi Burcunuz : maymun");
        }
        else if(dogumYili % 12 == 1){
            System.out.print("Cin Zodyagi Burcunuz : horoz");
        }
        else if(dogumYili % 12 == 2){
            System.out.print("Cin Zodyagi Burcunuz : kopek");
        }
        else if(dogumYili % 12 == 3){
            System.out.print("Cin Zodyagi Burcunuz : domuz");
        }
        else if(dogumYili % 12 == 4){
            System.out.print("Cin Zodyagi Burcunuz : fare");
        }
        else if(dogumYili % 12 == 5){
            System.out.print("Cin Zodyagi Burcunuz : okuz");
        }
        else if(dogumYili % 12 == 6){
            System.out.print("Cin Zodyagi Burcunuz : kaplan");
        }
        else if(dogumYili % 12 == 7){
            System.out.print("Cin Zodyagi Burcunuz : tavsan");
        }
        else if(dogumYili % 12 == 8){
            System.out.print("Cin Zodyagi Burcunuz : ejderha");
        }
        else if(dogumYili % 12 == 9){
            System.out.print("Cin Zodyagi Burcunuz : yilan");
        }
        else if(dogumYili % 12 == 10){
            System.out.print("Cin Zodyagi Burcunuz : at");
        }
        else if(dogumYili % 12 == 11){
            System.out.print("Cin Zodyagi Burcunuz : koyun");
        }
    }
}
