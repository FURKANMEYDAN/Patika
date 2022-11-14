import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] dizi={7,5,18,3,6,0,9,4,2};
        int mother=dizi[0];
        int[] left=new int[dizi.length];
        int[] right=new int[dizi.length];
        int count=0;
        for (int i=1;i<dizi.length;i++){
                if (dizi[i]<mother){
                    left[count++]=dizi[i];
                }else {
                    right[count++]=dizi[i];
                }
        }

        System.out.print(Arrays.toString(dizi)+"\n");
        for (int i=0;i<left.length;i++){

            if (left[i]!=0){
                System.out.print(left[i]+" ");
            }
        }System.out.println();
        for (int i=0;i<right.length;i++){

            if (right[i]!=0){
                System.out.print(right[i]+" ");
            }
        }System.out.println();
    }
}
