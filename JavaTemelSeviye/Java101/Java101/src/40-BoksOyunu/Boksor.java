public class Boksor {
    String boksorun_adi;
    int boksorun_kilo;
    int vurus_gucu;

    double bloklama_sansi;
    int can;
    double ilkvurus_olasiligi;



    Boksor(String boksorun_adi,int boksorun_kilo,int vurus_gucu,int bloklama_sansi,int can,int ilkvurus_olasiligi){
        this.boksorun_adi=boksorun_adi;
        this.boksorun_kilo=boksorun_kilo;
        this.vurus_gucu=vurus_gucu;
        this.bloklama_sansi=bloklama_sansi;
        this.can=can;
        this.ilkvurus_olasiligi=ilkvurus_olasiligi;

    }
    public int yumruk(Boksor dusman){
        System.out.println(this.boksorun_adi+" "+dusman.boksorun_adi+"'e "+this.vurus_gucu+" hasar vurdu");
        if (dusman.dodge()){
            System.out.println(dusman.boksorun_adi+" Gelen yumrugu savusturdu!");
            return dusman.can;
        }
        if (dusman.can-this.vurus_gucu<0){
            return 0;
        }
        return dusman.can-this.vurus_gucu;
    }
    boolean dodge(){
        double rastgele=Math.random()*100;
        return this.bloklama_sansi>=rastgele;
    }
    boolean first_strike(){
        double random=Math.random()*100;
        return this.ilkvurus_olasiligi>=random;
    }

}
