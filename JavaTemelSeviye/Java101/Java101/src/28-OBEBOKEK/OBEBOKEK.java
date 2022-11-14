import java.util.Scanner;
public class OBEBOKEK {
    public static void main(String[] args) {
        int n1,n2,i=1,obeb=0,okek=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Lutfen bir n1 degeri giriniz:");
        n1=in.nextInt();
        System.out.print("Lutfen bir n2 degeri giriniz:");
        n2=in.nextInt();
      while (i<=n1){
          i++;
          if (n1%i==0&&n2%i==0){

              obeb=i;
          }



      }
        okek=n1*n2/obeb;
        System.out.println(obeb);
        System.out.println(okek);
    }
}
