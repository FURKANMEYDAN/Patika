import java.util.Scanner;
public class KombinasyonHesabi {
    public static void main(String[] args) {
        int sinir_sayisi,sinir_sayisi_2,i=1,j=1,k=1,n=1,r=1,fark_faktoryeli=1,fark,kombinasyon_sonucu;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir sinir sayisi giriniz:");
        sinir_sayisi=in.nextInt();
        System.out.println("Lutfen bir 2.sinir sayisi giriniz:");
        sinir_sayisi_2=in.nextInt();
        fark=sinir_sayisi-sinir_sayisi_2;
        while (i<=sinir_sayisi){
                while (j<=sinir_sayisi_2){
                    while (k<=fark){
                        if((fark<0)){
                            fark*=-1;
                        }
                        fark_faktoryeli*=k;
                        k++;

                    }

                    r*=j;
                    j++;
                }
            n*=i;
            i++;
        }


        kombinasyon_sonucu=n/(r*fark_faktoryeli);
        System.out.print("("+sinir_sayisi+","+sinir_sayisi_2+")"+" kombinasyonu sonucu ===>"+kombinasyon_sonucu);




    }
}
