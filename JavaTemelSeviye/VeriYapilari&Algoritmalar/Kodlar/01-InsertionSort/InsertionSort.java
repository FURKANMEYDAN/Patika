import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] dizi={7,3,5,8,2,9,4,15,6};
        int sayac=0;
        /*
        [22,27,16,2,18,6] dizisinde 18'i ele alırsak worst case kısmına girer
        O(n^2) big o gösterimi
        sort türüne göre sırayla compareleyerek sıralamaya çalışıyoruz
         */
        for (int i=1;i<dizi.length;i++){
            int key=dizi[i];
            int j = i-1;
            while (j>=0&&dizi[j]>key){
                dizi[j+1]=dizi[j];
                j=j-1;


            }
            dizi[j+1]=key;
            sayac++;System.out.print(Arrays.toString(dizi)+"\n");
            if (sayac==4){
                break;
            }

        }
    }

}
