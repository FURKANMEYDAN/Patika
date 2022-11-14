import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        int kullanici_girdisi;
        Scanner in = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz:");
        kullanici_girdisi=in.nextInt();


        for(int i=kullanici_girdisi;i>=1;i--){
            for(int j=kullanici_girdisi-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int k=(2*i)-1;k>=1;k--){
                System.out.print("*");



            }

            System.out.println();


        }



    }
}
