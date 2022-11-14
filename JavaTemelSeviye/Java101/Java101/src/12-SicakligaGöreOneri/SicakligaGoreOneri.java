import java.util.Scanner;
public class SicakligaGoreOneri {
    public static void main(String[] args) {
        double sicaklik;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir sicaklik degeri giriniz:");sicaklik = in.nextDouble();
        if (sicaklik<5){
            System.out.println("Kayak yapabilirsiniz!");
        } else if (sicaklik>5 && sicaklik<25) {
            System.out.println("Sinemaya gidebilirsiniz!");
             if (sicaklik>15 && sicaklik<25) {
                System.out.println("Piknige gidebilirsiniz!");
            }
        }  else if (sicaklik>25) {
            System.out.print("Yuzmeye gidebilirisiniz!");
        }
    }
}
