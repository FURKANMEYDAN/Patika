import java.util.Scanner;
public class MukemmelSayi {


    public static void main(String[] args) {
        int kullanici_girisi, i = 1, toplam = 0;


        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        kullanici_girisi = in.nextInt();
        while (i <= kullanici_girisi) {

            if (kullanici_girisi % i == 0) {
                toplam += i;


            }
            i++;

        }
        toplam-=kullanici_girisi;
        if(toplam==kullanici_girisi){
            System.out.println(kullanici_girisi+" sayisi mukemmel sayidir");

        }else {

            System.out.println(kullanici_girisi+" sayisi mukemmel sayi degildir!");
        }
    }
}