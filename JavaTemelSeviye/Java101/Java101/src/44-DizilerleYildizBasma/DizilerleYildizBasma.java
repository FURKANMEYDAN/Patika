public class DizilerleYildizBasma {


    static void yildizbasan(String[][] matris){
        for (int i=0;i<matris.length;i++){
            for (int j=0;j<matris[i].length;j++){
                if (i==0||i==3||i==6){
                    if (i==0&&j==4){
                        matris[i][j]="  ";
                    } else if (i==3&&j==4) {
                        matris[i][j]="  ";
                    } else if (i==6&&j==4) {
                        matris[i][j]="  ";
                    } else {
                        matris[i][j]=" * ";
                    }
                }
                else if (j==0||j==4) {
                    matris[i][j]=" * ";
                }else {
                    matris[i][j]="   ";
                }
            }

        }
        for (String[] row:matris){
            for (String col:row){
                System.out.print(col);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        String[][] dizi=new String[7][5];
        yildizbasan(dizi);




    }
}
