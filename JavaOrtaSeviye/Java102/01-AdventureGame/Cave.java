import java.util.Random;
import java.util.Scanner;

public class Cave extends BattleLoc{
    private QuestItems questItems;
    public Cave(Player player) {
        super(player, "Cave", new Zombie(),3,QuestItems.getQuestObjByID(1),1);

    }

    public QuestItems getQuestItems() {
        return questItems;
    }

    public void setQuestItems(QuestItems questItems) {
        this.questItems = questItems;
    }
}
