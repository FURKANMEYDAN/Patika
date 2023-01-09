import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Please enter your name:");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("WELCOME! "+player.getName());
        System.out.println();
        System.out.println("(To complete the quest you have to get 3 items(Coal,Water,Firewood) and head back to SafeHouse) Good luck! ");
        System.out.println();
        player.selectChar();
        player.selectLoc();
    }
}
