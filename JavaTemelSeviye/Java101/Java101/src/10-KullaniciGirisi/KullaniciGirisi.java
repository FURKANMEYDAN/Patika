import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String usrname, password;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adınızı giriniz:");
        usrname = input.nextLine();
        System.out.println("Lütfen şifrenizi giriniz:");
        password = input.nextLine();
        if (password.equals("furkan") && usrname.equals("furkan")) {
            System.out.println("Başarıyla giriş yaptınız...");
        } else {
            System.out.println("Kullanıcı adınız ya da şifre yanlış!");
            System.out.println("Lutfen yeni bir sifre olusturunuz!");
            System.out.println("Yeni sifre:");
            password = input.nextLine();

            if (password.equals("furkan")) {
                System.out.println("Girdiğiniz şifre öncekiyle aynı lütfen tekrar deneyiniz!");
            } else {
                System.out.println("Şifreniz başarıyla kaydedilmiştir..");
            }

        }
    }
}
