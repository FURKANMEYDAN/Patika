import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class GelismisHesapMakinesi {
    static void toplama() {
        double sayi1, sayi2, sonuc;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        sayi1 = in.nextInt();
        System.out.println("Lutfen bir sayi giriniz:");
        sayi2 = in.nextInt();
        sonuc = sayi1 + sayi2;
        System.out.println("Sonuc: " + sonuc);
    }

    static void cikarma() {
        double sayi1, sayi2, sonuc;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        sayi1 = in.nextInt();
        System.out.println("Lutfen bir sayi giriniz:");
        sayi2 = in.nextInt();
        if (sayi1 > sayi2) {
            sonuc = sayi1 - sayi2;


        } else {
            sonuc = sayi2 - sayi1;

        }
        System.out.println("Sonuc: " + sonuc);
    }

    static void carpma() {
        int sayi1;
        double sonuc = 1.0, sayi2;
        Scanner in = new Scanner(System.in);
        System.out.println("Kac adet sayiyi carpmak istersiniz:");
        sayi1 = in.nextInt();
        for (int i = 1; i <= sayi1; i++) {
            System.out.print(i+". sayiyi giriniz:");
            sayi2 = in.nextDouble();
            sonuc *= sayi2;

        }
        System.out.println("Sonuc: " + sonuc);
    }

    static void bolme() {
        int sayi1;
        double sonuc = 1.0, sayi2;
        Scanner in = new Scanner(System.in);
        System.out.println("Kac adet sayiyi bolmek istersiniz:");
        sayi1 = in.nextInt();
        for (int i = 1; i <= sayi1; i++) {
            System.out.print(i+". sayiyi giriniz:");
            sayi2 = in.nextDouble();
            if (sayi2 == 0 && i != 1) {
                System.out.println("Bolen tarafa 0 girdiniz!!");
            }

            sonuc /= sayi2;

        }
        System.out.println("Sonuc: " + sonuc);
    }

    static void uslu_islem() {
        int sayi1, sayi2;
        int sonuc = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir taban sayisi giriniz:");
        sayi1 = in.nextInt();
        System.out.println("Lutfen bir us sayisi giriniz:");
        sayi2 = in.nextInt();
        for (int i = 1; i <= sayi2; i++) {

            sonuc *= sayi1;
            if (sayi1 == 0) {

                sonuc = 1;
            }

        }
        System.out.println("Sonuc: " + sonuc);
    }

    static void faktoryel() {
        int sayi1;
        int sonuc = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir taban sayisi giriniz:");
        sayi1 = in.nextInt();
        for (int i = 1; i <= sayi1; i++) {
            sonuc *= i;
        }
        System.out.println("Sonuc: " + sonuc);
    }

    static void mod() {
        int sayi1, sayi2;
        int sonuc = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        sayi1 = in.nextInt();
        System.out.println("Lutfen bir sayi giriniz:");
        sayi2 = in.nextInt();
        if (sayi1 > sayi2) {
            sonuc = sayi1 % sayi2;
        } else {


            sonuc = sayi2 % sayi1;
        }
        if (sayi1 == 0 || sayi2 == 0) {
            System.out.println("bolen veya bolunen sifir olamaz!");
        }
        System.out.println("Sonuc: " + sonuc);
    }

    static void diktorgen_alani() {
        int sayi1, sayi2;
        int sonuc = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen kisa kenari  giriniz:");
        sayi1 = in.nextInt();
        System.out.println("Lutfen uzun kenari giriniz:");
        sayi2 = in.nextInt();
        sonuc = sayi1 * sayi2;
        System.out.println("Sonuc: "+sonuc);

    }



    public static void main(String[] args) {
        int kullaninici_secimi;
        Scanner in = new Scanner(System.in);


        do {
            System.out.println("1-Toplama Islemi " + " 2-Cikarma Islemi\n" +
                    "3-Carpma Islemi " + " 4-Bolme Islemi\n" + "5-Uslu Islem " + " 6-Faktoryel Hesabi\n" +
                    "7-Mod Alma " + " 8-Dikdortgen Alan Hesabi\n"+"Cikis icin '0' tuslayiniz");
            System.out.print("Lutfen bir secim yapiniz: ");
            kullaninici_secimi = in.nextInt();
            switch (kullaninici_secimi) {
                case 1:
                    toplama();
                   break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    uslu_islem();
                    break;
                case 6:
                    faktoryel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    diktorgen_alani();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Gecersiz giris yaptiniz!");

            }


        }while (kullaninici_secimi!=0);


    }
}
