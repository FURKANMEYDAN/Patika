import java.util.Arrays;
import java.util.Scanner;

public class DizilerdeElemanSiralama {
   static int[] sirala(int[] matris){
        int count=1,max=matris[0],min=matris[0],yeni_sira;
        for (int i=0;i<matris.length;i++){
            for (int j=0;j<matris.length;j++){
                if (matris[i]<=matris[j]){
                   yeni_sira=matris[i];
                   matris[i]=matris[j];
                   matris[j]=yeni_sira;
                }
            }
        }

      return matris;
    }


    public static void main(String[] args) {
        int kullanici_girdisi, yeni_sira;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen dizinin kac elemanli olacagini giriniz: ");
        kullanici_girdisi = in.nextInt();
        int[] dizi = new int[kullanici_girdisi];
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Lutfen dizinin " + i + ". elemanini giriniz: ");
            dizi[i] = in.nextInt();
        }
        System.out.println("dizinin ilk hali: "+Arrays.toString(dizi));
        System.out.println("dizinin siralanmis hali: "+Arrays.toString(sirala(dizi)));
    }
}