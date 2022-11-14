import java.util.Scanner;
public class ChinaZodiacCalculation {
    public static void main(String[] args) {
        int dogum_yili,kalan_yil;
        String burc="";
        boolean hata=false;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen dogdugunuz yili giriniz:");
        dogum_yili = in.nextInt();
        kalan_yil=dogum_yili%12;
        if (kalan_yil==0) {
            burc = "Maymun";
        } else if (kalan_yil==1) {
            burc="Horoz";
        } else if (kalan_yil==2) {
            burc="Kopek";
        } else if (kalan_yil==3) {
            burc="Domuz";
        } else if (kalan_yil==4) {
            burc="Fare";
        } else if (kalan_yil==5) {
            burc="Okuz";
        } else if (kalan_yil==6) {
            burc="Kaplan";
        }
        else if (kalan_yil==7) {
            burc="Tavsan";
        } else if (kalan_yil==8) {
            burc="Ejderha";
        } else if (kalan_yil==9) {
            burc="Yilan";
        } else if (kalan_yil==10) {
            burc="At";
        } else if (kalan_yil==11) {
            burc="Koyun";
        }
            System.out.println("Zodiac Burcunuz==> " + burc);


    }
}
