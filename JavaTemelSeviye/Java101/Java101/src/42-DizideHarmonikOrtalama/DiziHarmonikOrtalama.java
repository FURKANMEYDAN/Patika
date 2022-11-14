public class DiziHarmonikOrtalama {

    static double harmonik_seri(int[] matris){
        double seri=0;
        for (int i=0;i<matris.length;i++){
            seri+=(1.0/matris[i]);
        }

        return seri;
    }

    static double harmonik_ortalama(int[] matrix,double gelen_deger){
        double giden_deger;
        giden_deger=matrix.length/gelen_deger;
        return giden_deger;
    }

    public static void main(String[] args) {
        int[] dizi={1,2,3,4,5,6,7,8,9,10};
        System.out.println((double)Math.round(harmonik_ortalama(dizi,harmonik_seri(dizi))*100)/100);

    }
}
