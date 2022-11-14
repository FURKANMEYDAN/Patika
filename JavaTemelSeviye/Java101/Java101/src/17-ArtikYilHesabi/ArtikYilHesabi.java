import java.util.Scanner;
public class ArtikYilHesabi {
    public static void main(String[] args) {
        int yil;


        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz:");
        yil = in.nextInt();

        if (yil%100==0){
            if (yil%400==0){
                System.out.println(yil+" Yili artik yildir!");
            }else{
                System.out.println(yil+" Yili artik yil degildir!");
            }
        } else if (yil%4==0) {
            System.out.println(yil+" Yili artik yildir");
        }else{
            System.out.println(yil+" Yili artik yil degildir!");
        }

    }
}
