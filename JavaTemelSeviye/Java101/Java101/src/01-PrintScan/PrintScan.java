import java.util.Scanner;
public class PrintScan {
    public static void main(String[] args) {
        int mat,fiz,kim,biy;


        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        System.out.println("Matematik notunuz==>"+mat);
        System.out.println("Fizik notunuzu giriniz:");
        fiz = input.nextInt();
        System.out.println("Fizik notunuz===>"+fiz);
        System.out.println("Kimya notunuzu giriniz:");
        kim = input.nextInt();
        System.out.println("Kimya notunuz===>"+kim);
        System.out.println("Biyoloji notunuzu giriniz:");
        biy = input.nextInt();
        System.out.println("Biyoloji notunuz==>"+biy);

    }
}
