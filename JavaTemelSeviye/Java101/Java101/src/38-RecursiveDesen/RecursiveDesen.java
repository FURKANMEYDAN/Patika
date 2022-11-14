import java.util.Scanner;
public class RecursiveDesen {

    static  int desen_azaltma(int sayi){
        if (sayi<=0){
            return sayi;
        }
        System.out.print(sayi+" ");
        return desen_azaltma(sayi-5);

    }
    static int desen_arttirma(int sayi,int ilk_hali){//sayi=16
        System.out.print(sayi+" ");// 16 11 6 1 -4 1 6 11 16

        if (sayi==ilk_hali){
            return sayi;
        }
        return desen_arttirma(sayi+5,ilk_hali);
    }
    public static void main(String[] args) {
        int kullanici_girdisi;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        kullanici_girdisi=in.nextInt();

        desen_arttirma(desen_azaltma(kullanici_girdisi),kullanici_girdisi);


    }
}
