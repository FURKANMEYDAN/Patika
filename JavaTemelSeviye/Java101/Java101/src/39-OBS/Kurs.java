class Kurs {
    Ogretmen kurs_ogretmeni;
    String ders_kodu;
    String ders_adi;
    String ders_kisaltmasi;
    double not;


    Kurs(String ders_kodu,String ders_adi,String ders_kisaltmasi){
        this.ders_kodu=ders_kodu;
        this.ders_adi=ders_adi;
        this.ders_kisaltmasi=ders_kisaltmasi;
        this.not=0;




    }

    void Ogretmen_ekle(Ogretmen o){
        if(ders_kisaltmasi.equals(o.brans)){
            this.kurs_ogretmeni=o;
        }
        else {
            System.out.println(this.ders_adi+"Ogretmen bu dersi veremez!");
        }
    }
    void printOgretmen(){
        if (kurs_ogretmeni!=null){
            System.out.println(ders_adi+" dersinin ogretmeni "+kurs_ogretmeni.adi);
        }else {
            System.out.println(ders_adi+" dersine ogretmen atanmamistir!");
        }




    }
}
