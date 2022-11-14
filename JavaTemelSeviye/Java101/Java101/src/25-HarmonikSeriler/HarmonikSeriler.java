import java.util.Scanner;
public class HarmonikSeriler {
    public static void main(String[] args) {
        int count,kullanici_girdisi;
        double sonuc=0;

        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen kacinci adima kadar yapmak istediginizi giriniz:");
        kullanici_girdisi=in.nextInt();
        for(count=0;count<=kullanici_girdisi;count++){

            sonuc=1+(1.0/count);

        }
        System.out.println("elde edilen sonuc ==> "+sonuc);


    }
}
