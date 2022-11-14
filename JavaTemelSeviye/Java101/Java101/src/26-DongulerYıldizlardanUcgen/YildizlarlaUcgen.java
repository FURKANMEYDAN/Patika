import java.util.Scanner;
public class YildizlarlaUcgen {
    public static void main(String[] args) {
        int kullanici_girisi;

        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen kaca kadar yildiz cizmek istediginizi giriniz:");
        kullanici_girisi=in.nextInt();



        for (int i=1;i<=kullanici_girisi;i++){
            for (int k=1;k<=(kullanici_girisi-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println();

        }
        for(int a=kullanici_girisi;a>=1;a--){
            for(int b=kullanici_girisi-a;b>=1;b--){
                System.out.print(" ");
            }
            for (int c=(2*a)-1;c>=1;c--){
                System.out.print("*");
            }
            System.out.println();
        }



    }

}
