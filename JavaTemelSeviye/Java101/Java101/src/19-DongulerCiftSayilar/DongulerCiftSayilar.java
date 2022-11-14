import java.util.Scanner;
public class DongulerCiftSayilar {
    public static void main(String[] args) {
        int count=0,toplam=0;
        Scanner in = new Scanner(System.in);

        while (count%2==0) {
            System.out.println("Lutfen bir sayi giriniz:");
            count = in.nextInt();
            if (count%2==1){
                break;
            }else if(count % 2 == 0 && count % 4 == 0){
                toplam+=count;
            }
        }
        System.out.println(toplam);
    }
}
