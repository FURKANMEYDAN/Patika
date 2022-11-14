import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rnd=new Random();
        int rastgele=rnd.nextInt(100);
        int kullanici_giridisi,kalan_hak=5;
        Scanner in = new Scanner(System.in);
        boolean ilk_uyari=false;
        while (kalan_hak>0){
            System.out.println("Lutfen tahminizi giriniz: ");
            kullanici_giridisi=in.nextInt();
            if (kullanici_giridisi==rastgele){
                System.out.println("Tebrikler dogru tahmin!");
                break;
            }else {
                if (kullanici_giridisi<rastgele){
                    kalan_hak--;
                    System.out.println("girdiginiz sayi gizili sayidan kucuk\n"+"Kalan Hakkiniz: "+kalan_hak);
                }else if (kullanici_giridisi>rastgele){
                    kalan_hak--;
                    System.out.println("girdiginiz sayi gizli sayidan buyuk\n"+"Kalan Hakkiniz: "+kalan_hak);
                } else if (kullanici_giridisi>100||kullanici_giridisi<0) {
                    System.out.println("girdiginiz sayi 0-100 arasinda degil!");
                    if (!ilk_uyari){
                        ilk_uyari=true;
                        System.out.println("Ayni hata tekrarlanirsa hakkin azalir!");
                    }else {
                        kalan_hak--;
                        System.out.println("uyariya ragmen ayni hatayi yaptin kalan hakkin: "+kalan_hak);
                    }
                }
                if (kalan_hak==0){
                    System.out.println("GAME OVER!!");
                    System.out.println("Gizli sayi===> "+rastgele);

                }

            }






        }








    }
}
