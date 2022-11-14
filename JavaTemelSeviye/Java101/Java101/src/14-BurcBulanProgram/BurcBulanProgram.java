import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        int gun,ay;
        boolean iserror=false;
        String burc="";

        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen dogdugunuz ayi giriniz:");
        ay = in.nextInt();
        System.out.println("Lutfen dogdugunuz gunu giriniz:");
        gun = in.nextInt();

        if(ay==1){
            if (gun>=1&&gun<=31){
                if (gun<22){
                    burc="Oglak";
                }else{
                    burc="Kova";
                }

            }else{
                iserror=true;
            }

        } else if (ay==2) {
            if (gun>=1&&gun<=28){
                if (gun<20){
                    burc="Kova";
                }else{
                    burc="Balik";
                }

            }else{
                iserror=true;
            }
        } else if (ay==3) {
            if (gun>=1&&gun<=31){
                if (gun<21){
                    burc="Balik";
                }else{
                    burc="Koc";
                }

            }else{
                iserror=true;
            }
        } else if (ay==4) {
            if (gun>=1&&gun<=30){
                if (gun<21){
                    burc="Koc";
                }else{
                    burc="Boga";
                }

            }else{
                iserror=true;
            }
        } else if (ay==5) {
            if (gun>=1&&gun<=31){
                if (gun<22){
                    burc="Boga";
                }else{
                    burc="Ikizler";
                }

            }else{
                iserror=true;
            }
        } else if (ay==6) {
            if (gun>=1&&gun<=30){
                if (gun<23){
                    burc="Ikizler";
                }else{
                    burc="Yengec";
                }

            }else{
                iserror=true;
            }
        } else if (ay==7) {
            if (gun>=1&&gun<=31){
                if (gun<23){
                    burc="Yengec";
                }else{
                    burc="Aslan";
                }

            }else{
                iserror=true;
            }
        } else if (ay==8) {
            if (gun>=1&&gun<=31){
                if (gun<23){
                    burc="Aslan";
                }else{
                    burc="Basak";
                }

            }else{
                iserror=true;
            }
        } else if (ay==9) {
            if (gun>=1&&gun<=30){
                if (gun<23){
                    burc="Basak";
                }else{
                    burc="Terazi";
                }

            }else{
                iserror=true;
            }
        } else if (ay==10) {
            if (gun>=1&&gun<=30){
                if (gun<23){
                    burc="Terazi";
                }else{
                    burc="Akrep";
                }

            }else{
                iserror=true;
            }
        } else if (ay==11) {
            if (gun>=1&&gun<=30){
                if (gun<22){
                    burc="Akrep";
                }else{
                    burc="Yay";
                }

            }else{
                iserror=true;
            }
        } else if (ay==12) {
            if (gun>=1&&gun<=31){
                if (gun<22){
                    burc="Yay";
                }else{
                    burc="Oglak";
                }

            }else{
                iserror=true;
            }
        }
        if (iserror){
            System.out.println("Gecerli bir gun girmediniz!");

        }else{
            System.out.println("Burcunuz===>"+burc);

        }
    }
}
