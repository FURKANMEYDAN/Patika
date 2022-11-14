import java.util.Scanner;
public class KDV_Hesaplayici {
    public static void main(String[] args) {
        double fiyat;
        double kdv_orani;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir fiyat giriniz:");
        fiyat = input.nextDouble();
        if (fiyat>0 && fiyat<1000) {
            kdv_orani = 0.18;
            fiyat += fiyat*kdv_orani;
            System.out.println(fiyat);
        } else if (fiyat>=1000) {
            kdv_orani=0.08;
            fiyat += fiyat*kdv_orani;
            System.out.println(fiyat);
        }
    }
}
