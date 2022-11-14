import java.util.Arrays;
import java.util.Scanner;

public class DizilerdeMaxveMin {

     static int max(int [] matris){
        int max=matris[0];

        for (int i=0;i< matris.length;i++){
            if (matris[i]>max){
                max=matris[i];
            }
        }


        return max;

    }
    static int min(int[] matrix){
        int min=matrix[0];

        for (int i=0;i< matrix.length;i++){
            if (matrix[i]<min){
                min=matrix[i];
            }
        }
        return min;
    }
    static int kucuk_en_yakin(int[] list,int kullanici_girdisi){
         int yakin_min_sayi=list[0];
         for (int i=0;i<list.length;i++){
             if (list[i]<kullanici_girdisi){
                if (Math.abs(list[i]-kullanici_girdisi)<Math.abs(yakin_min_sayi-kullanici_girdisi)){
                    yakin_min_sayi=list[i];
                }
             }
         }
         return yakin_min_sayi;
    }
    static int buyuk_en_yakin(int[] list,int kullanici_girdisi){
        int yakin_max_sayi=list[0];
        for (int i=0;i<list.length;i++){
            if (list[i]>kullanici_girdisi){
                if (Math.abs(list[i]-kullanici_girdisi)<Math.abs(yakin_max_sayi-kullanici_girdisi)){
                    yakin_max_sayi=list[i];
                }
            }
        }
        return yakin_max_sayi;
    }
    public static void main(String[] args) {
        int[] dizi={1,23,-2,5,8,11,-5,21,54,45};//-5,-2,1,2,5,8,11,21,23,45,54
        int kullanici_girdisi;
        Scanner in = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz: ");
        kullanici_girdisi=in.nextInt();
        System.out.println("dizideki max deger===> "+max(dizi)+"\ndizideki min deger===> "+min(dizi));
        System.out.println("girdiginiz sayiya  yakin en kucuk sayi====> "+kucuk_en_yakin(dizi,kullanici_girdisi)+"\ngirdiginiz sayiya  yakin en buyuk sayi====> "+buyuk_en_yakin(dizi,kullanici_girdisi));
    }
}
