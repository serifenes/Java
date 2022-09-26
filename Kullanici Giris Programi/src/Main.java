import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kullaniciAdi = "Enes";
        String sifre = "1234";

        while (true) {
            System.out.print("Kullanici adinizi giriniz : ");
            String kullaniciGiris = input.nextLine();
            System.out.print("Sifrenizi giriniz : ");
            String sifreGiris = input.nextLine();

            if (kullaniciAdi.equals(kullaniciGiris)) {
                if (sifre.equals(sifreGiris)) {
                    System.out.println("Giris basarili");
                    break;
                }
                else {
                    System.out.print("Yanlis sifre girdiniz sifirlamak ister misiniz ?(e/h)");
                    String secim = input.nextLine();
                    if (secim.equals("e")) {
                        System.out.print("Yeni sifrenizi giriniz : ");
                        String yeniSifre = input.nextLine();
                        sifre = yeniSifre;
                    }
                    else if(secim.equals("h")){
                        System.out.println("Program sonlandırılıyor...");
                        break;
                    }
                    else{
                        System.out.println("Yanlis secim yaptiniz");
                    }
                }
            }
            else{
                System.out.print("Yanlis kullanici adi girdiniz sifirlamak ister misiniz ?(e/h)");
                String secim = input.nextLine();
                if (secim.equals("e")) {
                    System.out.print("Yeni kullanici adinizi giriniz : ");
                    String yeniKullaniciAdi = input.nextLine();
                    kullaniciAdi = yeniKullaniciAdi;
                }
                else if(secim.equals("h")){
                    System.out.println("Program sonlandırılıyor...");
                    break;
                }
                else{
                    System.out.println("Yanlis secim yaptiniz");
                }
            }
        }
    }
}