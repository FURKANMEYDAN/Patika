public  class Asansorler extends Bina {
    private int yolcu_kapasitesi;
    Asansorler(int kat_numarasi,String dugmeler,String asansor_durumu,int yolcu_kapasitesi){
        super(kat_numarasi,dugmeler,asansor_durumu);
        this.yolcu_kapasitesi=yolcu_kapasitesi;
        }
    public void asagi_in(){

    }
    public void yukari_cik(){

    }
    @Override
    public void kapiyi_ac(){

    }
    @Override
    public void kapiyi_kapat(){

    }
    public void vardik_mi(){

    }
    @Override
    public void zili_cal(){

    }
    @Override
    public void sinyal_isigi_yak(){

    }
    Asansorler Asansor1 = new Asansorler(5,"yukari-asagi","yukari cikiyor",8);
    Asansorler Asansor2 = new Asansorler(1,"yukari-asagi","asagi iniyor",8);
    Asansorler Asansor3 = new Asansorler(12,"yukari-asagi","kullanim icin bekliyor",8);
    Asansorler Asansor4 = new Asansorler(9,"yukari-asagi","9. katta mesgul",8);
    Asansorler Asansor5 = new Asansorler(3,"yukari-asagi","3.katta mesgul",8);






}
