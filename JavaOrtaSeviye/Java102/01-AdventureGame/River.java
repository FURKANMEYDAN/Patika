import java.util.Random;

public class River extends BattleLoc{
    public River(Player player) {
        super(player,"River",new Bear(),3,QuestItems.getQuestObjByID(2),1);
    }


}
