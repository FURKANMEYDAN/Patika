import javax.swing.plaf.synth.SynthUI;
import java.util.Arrays;
import java.util.Scanner;

public class DizideFrekansBulma {
   /*static boolean ayni_mi(int[] matris, int tekrar_eden) {
        for (int i : matris) {
            if (matris[i] == tekrar_eden) {
                return true;
            }
        }




        return false;
    }
    */
    /*

    static int[] dizi_olusturma(int[] matris) {
        int user_input;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < matris.length; i++) {
            System.out.println("Lutfen dizinin " + i + " . elamanini giriniz:");
            matris[i] = in.nextInt();
        }


        return matris;
    }

    static int[] tekrar_eden_matris(int[] matris) {
        int[] yeni_matris = new int[matris.length];
        int count = 0;
        int[] sayac_matris = new int[matris.length];
        Arrays.fill(sayac_matris,1);
        for (int i=0;i<matris.length;i++) {
            for (int j = 0; j < matris.length; j++) {
                if ((i != j) && (matris[i] == matris[j])) {
                    sayac_matris[i]++;
                     if (!ayni_mi(yeni_matris,matris[i])) {
                         yeni_matris[count++] = matris[i];
                         break;
                     }
                }
            }
        }
        for (int i=0;i<matris.length;i++) {
            for (int j = 0; j < matris.length; j++) {
                if ((i != j) && (matris[i] == matris[j])) {
                    matris[j]=0;
                }
            }
        }
        for (int i=0;i<matris.length;i++){

            if (sayac_matris[i]>1&&matris[i]!=0){

                System.out.println(matris[i]+" sayisi "+sayac_matris[i]+" kere tekrar etti");
            }
        }

        return yeni_matris;
    }
*/




    public static void main(String[] args) {
        int kullanici_girdisi;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen dizinin kac elemanli olacagini giriniz:");
        kullanici_girdisi=in.nextInt();


        int[] dizi= new int[kullanici_girdisi];
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Lutfen dizinin " + i + " . elamanini giriniz:");
            dizi[i] = in.nextInt();
        }
        int[] sayac=new int[dizi.length];

        /*int[] yeni_matris=new int[dizi.length];
        yeni_matris=tekrar_eden_matris(dizi_olusturma(dizi));
        System.out.print("\ntekrar eden sayilar===> "+"[");
        for (int i:yeni_matris){
            if (i!=0)System.out.print(i+" ");

        }
        System.out.print("]");
        */
        Arrays.fill(sayac,1);
        for (int i=0;i<dizi.length;i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    sayac[i]++;
                    dizi[j] = 0;
                }
            }
        }
        for (int i=0;i<dizi.length;i++) {
            if (dizi[i] != 0) {
                System.out.println(dizi[i] + " sayisi " + sayac[i] + " kere tekrar etti");
            }
        }

    }
}
