import java.util.Scanner;
public class GectiKaldi {
    public static void main(String[] args) {
        int fiz,kim,biy,turk,tarih,muz;
        int ort;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Fizik dersi notunuzu giriniz:");
        fiz = input.nextInt();
        System.out.println("Lutfen Kimya notunuzu giriniz:");
        kim = input.nextInt();
        System.out.println("Lutfen Biyoloji notunuzu giriniz:");
        biy = input.nextInt();
        System.out.println("Lutfen Turkçe notunuzu giriniz:");
        turk = input.nextInt();
        System.out.println("Lutfen Tarih notunuzu giriniz:");
        tarih = input.nextInt();
        System.out.println("Lutfen Muzik notunuzu giriniz:");
        muz = input.nextInt();
        ort = (fiz +kim+biy+turk+tarih+muz)/6;
        if (ort >= 60) {

            System.out.println("Başarılı bir şekilde geçtiniz!");


        }else {

            System.out.println("Kaldınız!");
        }
    }
}
