import java.util.Scanner;

public class PalindromikKelimeler {
    public static void main(String[] args) {
        String kullanici_girdisi,ters_hali="";
        Scanner in =new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz:");
        kullanici_girdisi=in.nextLine();
        boolean isOk=false;
        for (int i=kullanici_girdisi.length()-1;i>=0;i--){
            ters_hali+=kullanici_girdisi.charAt(i);
        }
        if (kullanici_girdisi.equals(ters_hali)){
            System.out.println("ayni\n"+kullanici_girdisi+" ====> "+ters_hali);
        }else System.out.println("ayni degil!\n"+kullanici_girdisi+" ====> "+ters_hali);
    }
}
