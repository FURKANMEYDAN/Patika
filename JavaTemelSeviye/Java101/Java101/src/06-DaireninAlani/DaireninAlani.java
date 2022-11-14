
import java.util.Scanner;
public class DaireninAlani {
    public static void main(String[] args) {
        double pi=3.14,alan;
        int aci,yaricap;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dairenin yari çapını giriniz:");
        yaricap = input.nextInt();
        System.out.println("Lutfen dairenin acisini giriniz:");
        aci = input.nextInt();
        alan = (pi*yaricap*yaricap*aci)/360;
        System.out.println("Dairenin alanı === >"+alan);
    }
}
