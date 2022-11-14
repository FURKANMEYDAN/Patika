import java.util.Scanner;
public class GirilenSayiyaKadarKuvvetBulma {
    public static void main(String[] args) {
        int sinir_sayi,count=1,count_1=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir sinir sayisi belirleyiniz:");
        sinir_sayi = in.nextInt();

       while (count<sinir_sayi&&count_1<sinir_sayi){

           System.out.println(count+","+count_1);
           if(count*4<sinir_sayi&&count_1*5>sinir_sayi){
               count*=4;
               continue;
           }
           count*=4;count_1*=5;

       }




            }
}
