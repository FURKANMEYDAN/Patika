import java.util.Scanner;
public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        int km,yolculuk_tipi,yas;
        double fiyat;
        boolean hatali=false;

        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen gitmek istediginiz mesafeyi giriniz:");
        km = in.nextInt();
        System.out.println("Lutfen yasinizi giriniz:");
        yas = in.nextInt();
        System.out.print("Lutfen yolculuk tipini giriniz\n");
        System.out.println("TekYon==>1 GidisDonus==>2 :");
        yolculuk_tipi = in.nextInt();
        fiyat = 0.1*km;

        switch (yolculuk_tipi){

            case 1:
                if (yas>0&&km>0){
                if (yas<12){
                    fiyat-=fiyat*.5;
                } else if (yas>=12&&yas<=24) {
                    fiyat-=fiyat*.1;
                    
                } else if (yas>65) {
                    fiyat-=fiyat*.3;
                    
                }
                }else{
                    hatali=true;
                }
                break;
            case 2:
                if (yas>0&&km>0){
                fiyat-=fiyat*.2;
                if (yas<12){
                    fiyat-=fiyat*.5;
                } else if (yas>=12&&yas<=24) {
                    fiyat-=fiyat*.1;

                } else if (yas>65) {
                    fiyat-=fiyat*.3;

                }
                }else {
                    hatali = true;
                }
                break;
            default:
                hatali=true;

        }
        if (hatali){
            System.out.println("Hatali islem yaptiniz !");
        }else {
            System.out.println("Odemeniz gereken toplam tutar:"+fiyat+"TL");
        }
    }
}
