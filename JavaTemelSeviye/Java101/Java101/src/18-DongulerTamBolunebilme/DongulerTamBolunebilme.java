import java.util.Scanner;
public class DongulerTamBolunebilme {
    public static void main(String[] args) {
        int girilen_sayi,i=0,toplam=0,k=0;
        double ortalama;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        girilen_sayi = in.nextInt();
        while (i<girilen_sayi){
            if (i%3==0 && i%4==0){
                toplam=toplam+i;
                k++;
            }
            i++;

        }
        ortalama=toplam/k;
        System.out.println(ortalama);

    }
}
