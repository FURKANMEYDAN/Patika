import java.util.Random;

public class Snake extends Mob {
    private Mob mob;


    private Player player;
    private static Random rnd= new Random();

   public Snake(){

       super("Snake", rnd.nextInt(3)+3,12,0,true);
   }








    }

