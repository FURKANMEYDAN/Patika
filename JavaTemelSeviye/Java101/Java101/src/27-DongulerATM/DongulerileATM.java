import java.util.Scanner;
public class DongulerileATM {

    public static void main(String[] args) {
        double bakiye=2500;
        int kalan_hak=3,kullanici_secimi,para_islem_miktari;
        String sifre,kullanici_adi;
        Scanner in = new Scanner(System.in);
        while (kalan_hak>0){
            System.out.print("Lutfen kullanici adinizi giriniz:===>");
            kullanici_adi=in.nextLine();
            System.out.print("Lutfen sifrenizi girinizi:===>");
            sifre=in.nextLine();
            if(kullanici_adi.equals("furkan")&&sifre.equals("f1u9r9k8aN")){
                System.out.println("Furkan bankasina hosgeldiniz!");
                System.out.println("1-Para cekme\n"+
                        "2-Para yatirma\n"+
                        "3-Bakiye sorgulama\n"+
                        "4-Cikis yap");
                System.out.print("Lutfen yapmak istediginiz islemi seciniz:===> ");
                kullanici_secimi=in.nextInt();
                switch (kullanici_secimi){
                    case 1:
                        System.out.print("Lutfen ne kadar para cekmek istediginizi giriniz:");
                        para_islem_miktari=in.nextInt();
                        bakiye-=para_islem_miktari;
                        System.out.println("Guncel bakiyeniz: "+bakiye);
                        return;

                    case 2:
                        System.out.print("Lutfen ne kadar para yatirmak istediginizi giriniz:");
                        para_islem_miktari=in.nextInt();
                        bakiye+=para_islem_miktari;
                        System.out.println("Guncel bakiyeniz : "+bakiye);
                        return;
                    case 3:
                        System.out.print("Guncel bakiyeniz: "+bakiye);
                        return;

                    case 4:
                        return;
                }



            }else {
                kalan_hak--;
                System.out.println("Kullanici adi veya sifreniz yanlis tekrar deneyiniz !");
            if (kalan_hak==0){

                System.out.println("Tekrar deneme hakkiniz kalmadi lutfen banka ile gorusun!!");
            }else{
                System.out.println("Kalan hakkiniz: "+kalan_hak);
            }


            }



        }




    }
}
