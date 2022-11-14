import java.util.Scanner;
public class RecursiveAsalMi {
    static int asal_mi(int sayi,int i) {
        if(i<sayi){
            if (sayi % i != 0) {
                return asal_mi(sayi, ++i);
            }
            else {
                return 0;
            }

        }

        return 1;
    }


    public static void main(String[] args) {
        int kullanici_girdisi;
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        kullanici_girdisi=in.nextInt();
        x=asal_mi(kullanici_girdisi,2);
        if (x==1){
            System.out.print(kullanici_girdisi+" sayisi asaldir");
        }else {
            System.out.println("sayisi asal degildir");
        }
    }
}
