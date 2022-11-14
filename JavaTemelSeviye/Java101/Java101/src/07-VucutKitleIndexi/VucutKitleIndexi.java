import java.util.Scanner;
public class VucutKitleIndexi {
    public static void main(String[] args) {
        double kilo,boy,index;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz:");
        kilo = input.nextDouble();
        System.out.println("Lütfen boyunuzu(metre cinsinden '.' ile)giriniz:");
        boy = input.nextDouble();
        index = kilo/(boy*boy);
        System.out.println("Vücut kitle indexiniz===>"+index);
    }
}
