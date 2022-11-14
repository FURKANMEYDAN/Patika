public class Ring {
    Boksor b1;
    Boksor b2;
    int max_kilo;
    int min_kilo;


    Ring(Boksor b1, Boksor b2, int max_kilo, int min_kilo) {
        this.b1 = b1;
        this.b2 = b2;
        this.max_kilo = max_kilo;
        this.min_kilo = min_kilo;


    }


    void dovus() {
        if (kilo_kontrol()) {
            while (b1.can >= 0 || b2.can >= 0) {
                if (b1.first_strike()) {
                    b2.can = b1.yumruk(b2);
                    if (kazandi_mi()) {
                        break;
                    }
                } else {
                    b1.can = b2.yumruk(b1);
                    if (kazandi_mi()) {
                        break;
                    }
                }
                son_durum();
            }
        }
    }


    boolean kilo_kontrol() {
        if (b1.boksorun_kilo <= max_kilo && b1.boksorun_kilo <= min_kilo && (b2.boksorun_kilo <= max_kilo && b2.boksorun_kilo >= min_kilo)) {

            System.out.println("Sikletler eşit dovus uygundur!");
            return true;
        } else {

            System.out.println("Sikletler esit degil dovus iptal!");
            return false;
        }
    }

    boolean kazandi_mi() {
        if (b1.can == 0) {
            System.out.println(b2.boksorun_adi + " " + b1.boksorun_adi + "'u yere yigdi");
            System.out.print("Dovusun galibi " + b2.boksorun_adi);
            return true;
        } else if (b2.can == 0) {
            System.out.println(b1.boksorun_adi + " " + b2.boksorun_adi + "'u yere yigdi");
            System.out.print("Dovusun galibi " + b1.boksorun_adi);
            return true;
        }
        return false;
    }

    void son_durum() {
        System.out.println(b1.boksorun_adi + " kalan saglik " + b1.can);
        System.out.println(b2.boksorun_adi + " kalan saglik " + b2.can);
    }


}
