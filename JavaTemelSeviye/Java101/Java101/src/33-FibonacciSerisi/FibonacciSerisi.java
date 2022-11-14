import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        int kullanici_girdisi,n1=0,n2=1,n3;

        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen kac adet fibonnaci gormek istediginizi yazın:");
        kullanici_girdisi=in.nextInt();
        System.out.print(n1+" "+n2);
        for (int i=2;i<kullanici_girdisi;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

            }
            System.out.println();

        }


        }






