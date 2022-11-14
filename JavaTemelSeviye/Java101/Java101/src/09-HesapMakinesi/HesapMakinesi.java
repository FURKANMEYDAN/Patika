import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int secim;
        double n1,n2,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.println("Toplama icin:1\nCıkarma işlemi icin:2\nCarpma islemi icin:3\nBölme işlemi için:4");
        System.out.println("Lutfen yapmak istediginiz islemin numarasını giriniz:");
        secim = input.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Lutfen toplamak istediginiz 1. sayıyı giriniz:");
                n1 = input.nextDouble();
                System.out.println("Lutfen toplamak istediginiz 2. sayıyı giriniz:");
                n2 = input.nextDouble();
                sonuc = n1 + n2;
                System.out.println("Sonucunuz:" + sonuc);
                break;
            case 2:
                System.out.println("Lutfen cıkarmak istediginiz 1. sayıyı giriniz:");
                n1 = input.nextDouble();
                System.out.println("Lutfen cıkarmak istediginiz 2. sayıyı giriniz:");
                n2 = input.nextDouble();
                sonuc = n1 - n2;
                System.out.println("Sonucunuz:" + sonuc);
                break;
            case 3:
                System.out.println("Lutfen carpmak istediginiz 1. sayıyı giriniz:");
                n1 = input.nextDouble();
                System.out.println("Lutfen carpmak istediginiz 2. sayıyı giriniz:");
                n2 = input.nextDouble();
                sonuc = n1 * n2;
                System.out.println("Sonucunuz:" + sonuc);
                break;
            case 4:
                System.out.println("Lutfen bolmek istediginiz 1. sayıyı giriniz:");
                n1 = input.nextDouble();
                System.out.println("Lutfen bolmek istediginiz 2. sayıyı giriniz:");
                n2 = input.nextDouble();
                sonuc = n1 / n2;
                System.out.println("Sonucunuz:" + sonuc);
                break;
            default:
                System.out.println("Lutfen gecerli bir secim yapin!\n");
        }
    }
}
