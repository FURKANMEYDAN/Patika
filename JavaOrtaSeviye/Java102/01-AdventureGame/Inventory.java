public class Inventory {

    private Weapons weapons;
    private Armors armors;
    private QuestItems questItems;

    public Inventory() {
        this.weapons = new Weapons(0,"Fist",0,0);
        this.armors = new Armors(0,"No armor",0,0);
        this.questItems=new QuestItems(0,"No quest item");
    }



    public QuestItems getQuestItems() {
        return questItems;
    }

    public void setQuestItems(QuestItems questItems) {
        this.questItems = questItems;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public Armors getArmors() {
        return armors;
    }

    public void setArmors(Armors armors) {
        this.armors = armors;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }
}
