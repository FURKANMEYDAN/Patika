import javax.swing.text.Style;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    static boolean inRange(String[][] dizi,int row_girdisi,int col_girdisi){
        int row_range=dizi.length;
        int col_range=dizi[0].length;
        if ((row_girdisi<row_range)&&(row_girdisi>=0)&&(col_girdisi<col_range)&&(col_girdisi>=0)){
            return true;
        }
        return false;
    }
    static int mayin_bulucu(String[][] dizi,int row_girdi,int col_girdi){
        int count=0;

            if(inRange(dizi,row_girdi+1,col_girdi)&&dizi[row_girdi+1][col_girdi]=="  *  "){
                count++;
            }
            if(inRange(dizi,row_girdi,col_girdi+1)&&dizi[row_girdi][col_girdi+1]=="  *  "){
                count++;
            }if (inRange(dizi,row_girdi+1,col_girdi+1)&&dizi[row_girdi+1][col_girdi+1]=="  *  ") {
                count++;
            }
            if (inRange(dizi,row_girdi-1,col_girdi)&&dizi[row_girdi-1][col_girdi]=="  *  "){
                count++;
            }if (inRange(dizi,row_girdi-1,col_girdi+1)&&dizi[row_girdi-1][col_girdi+1]=="  *  "){
                count++;
            }if (inRange(dizi,row_girdi+1,col_girdi-1)&&dizi[row_girdi+1][col_girdi-1]=="  *  "){
                count++;
            }
            if (inRange(dizi,row_girdi,col_girdi-1)&&dizi[row_girdi][col_girdi-1]=="  *  "){
                count++;
            }if (inRange(dizi,row_girdi-1,col_girdi-1)&&dizi[row_girdi-1][col_girdi-1]=="  *  "){
                count++;

            }



        return count;
    }
    public static void main(String[] args) {
        int row,col,sutun_girdisi,satir_girdisi,dogru_buldu=1;
        Random rnd=new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen mayin tarlasinin satir sayisini giriniz: ");
        row=in.nextInt();
        System.out.println("Lutfen mayin tarlasinin sutun sayisini giriniz: ");
        col=in.nextInt();
        String[][] dizi=new String[row][col];
        String[][] mayin_konumlari=new String[row][col];
        String[][] tarla=new String[row][col];
        for (int i=0;i<dizi.length;i++){
            for (int j=0;j<dizi[i].length;j++){
                dizi[i][j]="  -  ";
                mayin_konumlari[i][j]="  -  ";
                tarla[i][j]="  -  ";
            }
        }
        int ceyrek=(row*col)/4;
        int sayac=0;
        while (sayac!=ceyrek){
            int rastgele_row= rnd.nextInt(row);
            int rastgele_col= rnd.nextInt(col);
            if ((rastgele_row==row)&&(rastgele_col==col)||dizi[rastgele_row][rastgele_col]=="  *  "){
                continue;
            }else{
                dizi[rastgele_row][rastgele_col]="  *  ";
                mayin_konumlari[rastgele_row][rastgele_col]=dizi[rastgele_row][rastgele_col];
                sayac++;
            }

        }
        for (int i=0;i<tarla.length;i++) {
            for (int j=0;j<tarla[i].length;j++){
                System.out.println("================");
                for (String[] satir:tarla){
                    for (String sutun:satir){
                        System.out.print(sutun);
                    }
                    System.out.println();
                }
                System.out.println("Kacinci sutunu sectiniz : ");
                sutun_girdisi=in.nextInt();
                System.out.println("Kacinci satiri sectiniz : ");
                satir_girdisi=in.nextInt();
                if (mayin_konumlari[sutun_girdisi][satir_girdisi]=="  *  "){
                    System.out.println("GAME OVER!");
                    System.out.println("================");
                    for (String[] satir:mayin_konumlari){
                        for (String sutun:satir){
                            System.out.print(sutun);
                        }
                        System.out.println();
                    }
                    return;
                } else if (dogru_buldu==(row*col)-sayac) {
                    System.out.println("CONGRATILATIONS! YOU WIN THE GAME");
                    System.out.println("================");
                    for (String[] satir:tarla){
                        for (String sutun:satir){
                            System.out.print(sutun);
                        }
                        System.out.println();
                    }
                    return;
                } else {
                    System.out.println(dogru_buldu++);
                    int gelen_deger=mayin_bulucu(mayin_konumlari,sutun_girdisi,satir_girdisi);
                    String deneme="  "+gelen_deger+"  ";
                    tarla[sutun_girdisi][satir_girdisi]=deneme;

                }
            }
        }




    }
}
