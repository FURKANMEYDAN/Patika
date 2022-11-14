import java.util.Scanner;
public class UcgeninAlani {
    public static void main(String[] args) {
        int a,b,c,s;
        double alan;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir a kenari giriniz:");
        a = input.nextInt();
        System.out.println("Lütfen bir b kenari giriniz:");
        b = input.nextInt();
        System.out.println("Lütfen bir c kenari giriniz:");
        c = input.nextInt();

        s = (a+b+c)/2;
        alan=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Üçgenin alanı==>"+alan);
    }
}
