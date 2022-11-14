import java.util.Scanner;
public class DongulerUsluSayiHesabi {
    public static void main(String[] args) {
        int sonuc=1,taban,us,i=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir ussunu almak istediginiz sayiyi giriniz:");
        taban = in.nextInt();
        System.out.println("Lutfen kacinci kuvveti olacagini giriniz:");
        us = in.nextInt();

            for(i=0;i<us;i++){
                sonuc*=taban;
            }
        System.out.println(taban+"^"+us+"====>"+sonuc);

    }
}
