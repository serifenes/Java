import java.util.Scanner;
import java.util.Arrays;

public class DiziSirala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int index = 0;

        System.out.print("Kac eleman gireceksiniz : ");
        int elemanSayisi = input.nextInt();

        int dizi[] = new int[elemanSayisi];

        for (int i = 1; i <= elemanSayisi; i++) {
            System.out.print(i + ". elemani giriniz : ");
            dizi[index] = input.nextInt();
            index++;
        }
        Arrays.sort(dizi);
        System.out.println("Dizinin kucukten buyuge siralanmis hali : " + Arrays.toString(dizi));

    }
}
