import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        int kullanici_girdisi,comp,i=1,max=0,min=0;

        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen kac adet sayi gireceginizi yaziniz:");
        kullanici_girdisi=in.nextInt();
        while (i<=kullanici_girdisi){
            System.out.println(i+". sayiyi giriniz:");
            comp=in.nextInt();
            if(i==1){
                max=comp;
                min=comp;

            }

            if(comp>=max){
                max=comp;
            } else if (comp<=min) {
                min=comp;
            }
            i++;

        }
        System.out.println("en buyuk : "+max+" en kucuk : "+min);
    }
}
