public class Ucus extends Ucaklar{
    int benzersiz_kimlik;
    double kalkis_saati;
    double inis_saati;
    String pilot_ismi;
    String copilot_ismi;


    Ucus(String ucak_tipi,String ucak_durumu,int benzersiz_kimlik,double kalkis_saati,double inis_saati,String pilot_ismi,String copilot_ismi){
        super(ucak_tipi,ucak_durumu);
        this.benzersiz_kimlik=benzersiz_kimlik;
        this.kalkis_saati=kalkis_saati;
        this.inis_saati=inis_saati;
        this.pilot_ismi=pilot_ismi;
        this.copilot_ismi=copilot_ismi;
    }
    Ucus u1 = new Ucus("boing 755","calisir durumda",1,19.23,20.23,"furkan","meydans");
    public  void havalimani_inis(){

    }
    public void havalimani_kalkis(){

    }



}
