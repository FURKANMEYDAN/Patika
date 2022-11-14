import java.util.Scanner;
public class ManavUygulamasi {
    public static void main(String[] args) {
        double toplam=0,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,kilo;

        Scanner input = new Scanner(System.in);
        System.out.println("armut Kaç kilo?");
        kilo = input.nextDouble();
        toplam +=armut*kilo;
        System.out.println("elma Kaç kilo?");
        kilo = input.nextDouble();
        toplam +=elma*kilo;
        System.out.println("domates Kaç kilo?");
        kilo = input.nextDouble();
        toplam +=domates*kilo;
        System.out.println("muz Kaç kilo?");
        kilo = input.nextDouble();
        toplam +=muz*kilo;
        System.out.println("patlican Kaç kilo?");
        kilo = input.nextDouble();
        toplam +=patlican*kilo;
        System.out.println("Toplam ödemeniz gereken tutar :"+toplam);

    }
}
