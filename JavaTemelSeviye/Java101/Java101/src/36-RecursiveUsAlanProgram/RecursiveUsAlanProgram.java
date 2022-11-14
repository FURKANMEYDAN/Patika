import java.util.Scanner;
public class RecursiveUsAlanProgram {
    static int f(int taban,int us){
        int sonuc=1;
            if (us!=0){
                sonuc=taban*sonuc;
                return taban*f(taban,us-1);
            }
        return sonuc;
    }
    public static void main(String[] args) {
        int base,pow;


        Scanner in =new Scanner(System.in);

        System.out.println("Lutfen bir taban sayisi giriniz:");
        base=in.nextInt();
        System.out.println("Lutfen bir us sayisi giriniz:");
        pow=in.nextInt();
        System.out.println(f(base,pow));



    }
}
