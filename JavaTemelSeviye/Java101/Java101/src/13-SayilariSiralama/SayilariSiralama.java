import java.util.Scanner;
public class SayilariSiralama {
    public static void main(String[] args) {
        double sayi1,sayi2,sayi3;
        Scanner in = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz:");
        sayi1 = in.nextDouble();
        System.out.println("İkinci sayiyi giriniz:");
        sayi2 = in.nextDouble();
        System.out.println("Ucuncu sayiyi giriniz:");
        sayi3 = in.nextDouble();
        if (sayi1>sayi2 && sayi3<sayi2){
            System.out.println(sayi3+"<"+sayi2+"<"+sayi1);

        } else if (sayi2>sayi1 && sayi1>sayi3) {
            System.out.println(sayi3+"<"+sayi1+"<"+sayi2);
        } else if (sayi3>sayi1 && sayi1>sayi2) {
            System.out.println(sayi2+"<"+sayi1+"<"+sayi3);
        } else if (sayi2>sayi1 && sayi3>sayi1) {
            System.out.println(sayi1+"<"+sayi3+"<"+sayi2);
        } else if (sayi3>sayi1 && sayi2>sayi1) {
            System.out.println(sayi1+"<"+sayi2+"<"+sayi3);
        } else if (sayi1>sayi2 && sayi3>sayi2) {
            System.out.println(sayi2+"<"+sayi3+"<"+sayi1);
        }


    }
}
