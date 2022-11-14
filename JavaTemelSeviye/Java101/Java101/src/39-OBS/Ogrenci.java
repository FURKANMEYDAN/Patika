class Ogrenci {
    String adi,nu;
    int kacinci_sinif;
    Kurs mat;
    Kurs fizik;
    Kurs kimya;
    double ortalama;
    boolean gecti_mi;

    Ogrenci(String adi,String nu,int kacinci_sinif,Kurs mat,Kurs fizik,Kurs kimya){
        this.adi=adi;
        this.nu=nu;
        this.kacinci_sinif=kacinci_sinif;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        this.gecti_mi=false;
    }
    void not_ekle(int mat,int mat_sozlu,int fizik,int fizik_sozlu,int kimya,int kimya_sozlu){
        if ((mat>=0&&mat<=100)&&(mat_sozlu>=0)&&mat_sozlu<=100){
            this.mat.not=(mat*.8)+(mat_sozlu*.2);
        }if (fizik>=0&&fizik<=100){
            this.fizik.not=(fizik*.8)+(fizik_sozlu*.2);
        }if (kimya>=0&&kimya<=100){
            this.kimya.not=(kimya*.8)+(kimya_sozlu*.2);
        }
    }
    void gecti_mi(){
        if (this.mat.not==0||this.fizik.not==0||this.kimya.not==0){
            System.out.println("Notlar tam olarak girilmemis!!");
        }else {
            this.gecti_mi=ortalama_kontrol();
            notlari_goster();
            if (this.gecti_mi){
                System.out.println(this.adi+" basarili bir sekilde gecmistir!");
            }else {
                System.out.println(this.adi+" Maalesef kalmistir!");
            }
        }

    }
    void ortalama_hesapla(){


        this.ortalama=(this.mat.not+this.fizik.not+this.kimya.not)/3;
    }

    boolean ortalama_kontrol(){
        ortalama_hesapla();
        return this.ortalama>55;
    }
    void notlari_goster(){

        System.out.println("Ogrencinin adi: "+this.adi);
        System.out.println("Matematik dersinin notu: "+this.mat.not);
        System.out.println("Fizik dersinin notu: "+this.fizik.not);
        System.out.println("Kimya dersinin notu: "+this.kimya.not);


    }


}
