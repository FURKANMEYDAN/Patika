import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspoze {
    public static void main(String[] args) {
        int row,col;
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen matrisin sutun sayisini giriniz: ");
        row=in.nextInt();
        System.out.println("Lutfen matrisin kolon sayisini giriniz: ");
        col=in.nextInt();
        int[][] matris=new int[row][col];
        int[][] yeni_matris= new int[col][row];

        System.out.println("Lutfen "+row*col+" tane deger giriniz: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matris[i][j]=in.nextInt();
            }
        }
        System.out.print("------------------"+"\nMatris\n");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.print("\n");
        }
                System.out.print("\n"+"--------------"+"\nTranspose hali\n");
                for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                       // i0 j0-1,i0 j1-4,
                        // i1 j0-2,i1 j1-5
                        // i2 j0-6,i2 j1-3
                yeni_matris[i][j]=matris[j][i];
                System.out.print(yeni_matris[i][j]+" ");
            }
            System.out.println();

        }






    }
}
