public class Mine extends BattleLoc {
    private String locName;
    private int maxMob;
    private int minMob;

    public Mine(Player player) {
        super(player, "Mine", new Snake(),6 , QuestItems.getQuestObjByID(4), 3);

    }



    private Snake mobDrop;

    public Snake getMobDrop() {
        return mobDrop;
    }

    public void setMobDrop(Snake mobDrop) {
        this.mobDrop = mobDrop;
    }



}
