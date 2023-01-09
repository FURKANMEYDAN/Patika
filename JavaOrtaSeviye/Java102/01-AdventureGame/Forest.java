import java.util.Random;

public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(player, "Forest", new Vampire(),3,QuestItems.getQuestObjByID(3),1);
    }


}
