import java.util.Scanner;
public class OrtalamayaBagliGectiKaldi {
    public static void main(String[] args) {
        int mat,fiz,tur,kim,muz;

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuz:");
        mat = input.nextInt();
        System.out.println("Fizik notunuz:");
        fiz = input.nextInt();
        System.out.println("Türkçe notunuz:");
        tur = input.nextInt();
        System.out.println("Kimya notunuz:");
        kim = input.nextInt();
        System.out.println("Müzik notunuz:");
        muz = input.nextInt();

        if (mat>100 || mat<0){
            double ort = (fiz+tur+kim+muz)/4;
        }
        else if (fiz>100 || fiz<0){
            double ort = (mat+tur+kim+muz)/4;
        }
        else if (tur>100 || tur<0){
            double ort = (mat+fiz+kim+muz)/4;
        }
        else if (kim>100 || kim<0){
            double ort = (mat+fiz+tur+muz)/4;
        }
        else if (muz>100 || muz<0){
            double ort = (mat+fiz+tur+kim)/4;
        }
        double ort = (mat+fiz+tur+kim+muz)/5;
        if (ort>55) {
            System.out.println("Geçtiniz!");

        }else;System.out.println("Kaldınız!");
    }
}
