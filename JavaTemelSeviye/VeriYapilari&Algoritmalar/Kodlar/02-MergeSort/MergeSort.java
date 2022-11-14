import javax.swing.text.Style;
import java.util.Arrays;

public class MergeSort {
    static void merge(int[] dizi,int dizi_ilk,int dizi_son,int merged_dizi_son){
        // dizi_ilk_parca[dizi_son-dizi_ilk+1] dizi_ikinci_parca=[merged_dizi_son-dizi_son]
        //kisaca her eleman tek tek parçalaniyor
        //{16,21,11,8,12,22}==>[16][21][11][8][12][22] ve ayri ayri inceleniyor
        //sonrasinda tekrar siralanip birlestiriliyor
        //Big O notasyonuna göre O(n*log2(n)) gibi en iyi seneryo ve kotu seneryo icin soylenebilir
        int n1=dizi_son-dizi_ilk+1;
        int n2=merged_dizi_son-dizi_son;
        int dizi_ilk_parca[]=new int[n1];
        int dizi_ikinci_parca[]=new int[n2];

        for (int i=0;i<n1;i++)
            dizi_ilk_parca[i]=dizi[dizi_ilk+i];
        for (int j=0;j<n2;j++)
            dizi_ikinci_parca[j]=dizi[dizi_son+1+j];
        int i,j,k;
        i=0;
        j=0;
        k=dizi_ilk;
        while ((i<n1) && (j<n2)){
            if (dizi_ilk_parca[i]<=dizi_ikinci_parca[j]){
                dizi[k]=dizi_ilk_parca[i];
                i++;
            }else {
                dizi[k]=dizi_ikinci_parca[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            dizi[k]=dizi_ilk_parca[i];
            i++;
            k++;
        }
        while (j<n2){
            dizi[k]=dizi_ikinci_parca[j];
            j++;
            k++;
        }
    }
    static void merge_sort(int[] dizi,int l,int r) {
        if (l < r) {
            int bolme_noktasi = (l + r)/2;

            merge_sort(dizi, l, bolme_noktasi);
            merge_sort(dizi, bolme_noktasi + 1, r);

            merge(dizi, l, bolme_noktasi, r);
        }
    }
    static void dizi_basar(int[] dizi){
        for (int i:dizi){
            System.out.print(i+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int[] dizi={16,21,11,8,12,22};
        merge_sort(dizi,0, dizi.length-1);
        System.out.println("Siralanmis dizi: ");
        dizi_basar(dizi);
    }
}
