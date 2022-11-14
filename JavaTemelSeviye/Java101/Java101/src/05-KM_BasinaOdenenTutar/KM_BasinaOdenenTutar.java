import java.util.Scanner;
public class KM_BasinaOdenenTutar {
    public static void main(String[] args) {
        double tutar=10;
        int km;
        Scanner imput = new Scanner(System.in);
        System.out.println("Lütfen kaç km gittiğinizi giriniz:");
        km = imput.nextInt();
        tutar +=2.2*km;
        if (tutar<=20) {
            tutar = 20;
        }
        System.out.println("Ödemeniz gereken tutar miktarı:"+tutar);
    }
}
