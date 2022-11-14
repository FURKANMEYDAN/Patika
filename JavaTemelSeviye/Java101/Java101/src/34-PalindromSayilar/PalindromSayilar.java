import java.util.Scanner;
public class PalindromSayilar {


    static boolean palindrom_mu(int kullanici_girdisi){
        int gecici_sayi=kullanici_girdisi,terslenmis_sayi=0,son_hanesi;
        while (gecici_sayi!=0){
            son_hanesi=gecici_sayi%10;
            terslenmis_sayi=terslenmis_sayi*10+son_hanesi;
            gecici_sayi/=10;




        }
        if (terslenmis_sayi==kullanici_girdisi){

            return true;
        }else {
            return false;
        }



    }
    public static void main(String[] args) {
        int girdi;

        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        girdi=in.nextInt();
        if (palindrom_mu(girdi)){

            System.out.println(girdi+" sayisi palindromdur");
        }else {

            System.out.println(girdi+" sayisi palindrom degildir");
        }
    }
}
