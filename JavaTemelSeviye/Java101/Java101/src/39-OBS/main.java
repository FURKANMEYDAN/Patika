class main {
    public static void main(String[] args) {

        Kurs mat = new Kurs("MAT101","matematik","mat");
        Kurs fizik = new Kurs("FIZ101","fizik","fizik");
        Kurs kimya = new Kurs("KIM101","kimya","kimya");


        Ogretmen o1 = new Ogretmen("Captain (SOAP) MCTAVISH","5555","mat");
        Ogretmen o2 = new Ogretmen("Captain Price","555225","fizik");
        Ogretmen o3 = new Ogretmen("Simon (GHOST) Riley","555533","kimya");

        mat.Ogretmen_ekle(o1);
        fizik.Ogretmen_ekle(o2);
        kimya.Ogretmen_ekle(o3);

        Ogrenci s1 = new Ogrenci("Furkan","1",4,mat,fizik,kimya);
        s1.not_ekle(95,60,86,75,60,80);
        s1.gecti_mi();
        Ogrenci s2 = new Ogrenci("Bilgehan","2",4,mat,fizik,kimya);
        s2.not_ekle(70,70,40,40,45,95);
        s2.gecti_mi();
        Ogrenci s3 = new Ogrenci("Fahrenheit","3",4,mat,fizik,kimya);
        s3.not_ekle(65,45,40,40,45,50);
        s3.gecti_mi();


    }
}
