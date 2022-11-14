public class DizilerdeTekrarEdenSayi {
    static boolean ayni_mi(int[] dizi,int repeat_value){
        for (int i:dizi){
            if (dizi[i]==repeat_value){
                return true;
            }



        }


        return false;
    }

    public static void main(String[] args) {
        int[] dizi={2,1,4,5,1,2,4,5,6,8,9,12,12,34,2,4,6,7,8,9,8};
        int[] dizi_1= new int[dizi.length];
        int count=0;
        for (int i=0;i<dizi.length;i++){
            for (int j=0;j<dizi.length;j++){
                if ((i!=j)&&dizi[i]==dizi[j]){
                    if (!ayni_mi(dizi_1,dizi[i])&&dizi[i]%2==0){
                        dizi_1[count++]=dizi[i];
                        break;
                    }

                }

            }

        }
        System.out.print("[ ");
        for (int k: dizi_1){
            if (k!=0)System.out.print(k+" ");
        }
        System.out.print(" ]");

    }
}
