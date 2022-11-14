public class main {
    public static void main(String[] args) {
        Boksor b1=new Boksor("Rocky Balboa",85,45,30,150,25);
        Boksor b2=new Boksor("Apollo Creed",90,25,50,150,50);
        Ring r = new Ring(b1,b2,100,90);
        r.dovus();
    }
}
