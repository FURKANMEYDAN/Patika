public class SafeHouse extends  NormalLoc{


    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        if (isquestDone()){
            System.out.println("Congratilations you have complete all quests in the game");
            return false;
        }
        this.getPlayer().setHealth(this.getPlayer().getDefaultplayerHealth());
        System.out.println("You are in safe!\n Your health is restored current health: "+this.getPlayer().getHealth());

        return true;
    }
    public boolean isquestDone(){
        if (getPlayer().getInventory().getQuestItems().getName().equals("Firewood")){
            return true;
        }
        return false;
    }
}
