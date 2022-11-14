import java.util.Scanner;

public class BasamakSayilarinToplami {
    public static void main(String[] args) {
        int kullanici_girdisi,i=0,toplam=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        kullanici_girdisi=in.nextInt();

        //1643%10=3

        while (kullanici_girdisi!=0){
            toplam+=kullanici_girdisi%10;
            kullanici_girdisi=kullanici_girdisi/10;
            i++;
        }
        System.out.println("basamaklarinin toplami ===> "+toplam);



    }
}
