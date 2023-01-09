import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public abstract class BattleLoc extends Location {
    private Mob mob;
    private static Random rnd = new Random();
    private int minMob;
    private int maxMob;
    private QuestItems questItem ;

    private QuestItems items;



    private Scanner in = new Scanner(System.in);
    public BattleLoc(Player player, String name, Mob mob,int maxMob,QuestItems questItem,int minMob) {
        super(player, name);
        this.mob = mob;
        this.maxMob=maxMob;
        this.questItem=questItem;
        this.minMob=minMob;


    }

    public QuestItems getItems() {
        return items;
    }

    public void setItems(QuestItems items) {
        this.items = items;
    }



    public void playerStats(){
        System.out.println("Your Health: "+getPlayer().getHealth());
        System.out.println("Your Damage: "+getPlayer().getTotalDamage());
        System.out.println("Your Defence: "+getPlayer().getDefence());
    }
    public void mobStats(){
        System.out.println(getMob().getMobName()+"'s Health: "+getMob().getMobHealth());
        System.out.println(getMob().getMobName()+"'s Damage: "+getMob().getMobDamage());

    }

    public QuestItems getQuestItem() {
        return questItem;
    }

    public void setQuestItem(QuestItems questItem) {
        this.questItem = questItem;
    }

    public int getMaxMob() {
        return maxMob;
    }

    public int getMinMob() {
        return minMob;
    }

    public void setMinMob(int minMob) {
        this.minMob = minMob;
    }

    public void setMaxMob(int maxMob) {
        this.maxMob = maxMob;
    }

    @Override
    public boolean onLocation() {

        int mobNumber = this.randomMob();
        if ((getPlayer().getInventory().getQuestItems().getName().equals("Coal")||getPlayer().getInventory().getQuestItems().getName().equals("Water")||getPlayer().getInventory().getQuestItems().getName().equals("Firewood"))&&getMob().getMobName().equals("Zombie")){
            System.out.println("You have completed Cave you cannot enter again!");
            return true;
        }
        else if ((getPlayer().getInventory().getQuestItems().getName().equals("Water")||getPlayer().getInventory().getQuestItems().getName().equals("Firewood"))&&getMob().getMobName().equals("Bear")){
            System.out.println("You have completed River you cannot enter again!");
            return true;
        } else if (getPlayer().getInventory().getQuestItems().getName().equals("Firewood")&&getMob().getMobName().equals("Vampire")) {
            System.out.println("You have completed Forest you cannot enter again!");
            return true;
        }
        System.out.println("Be patient! "+mobNumber+" "+getMob().getMobName()+" is living here");
        System.out.println("Please choose <f>ight or <r>un away:");
        String selectOp = in.nextLine().toUpperCase();

        if (selectOp.equals("F")){

            if (combat(mobNumber)){
                getPlayer().getInventory().setQuestItems(getQuestItem());
                System.out.println("You have killed all mobs on this area");
                System.out.println("You have "+getPlayer().getInventory().getQuestItems().getName()+" now!");



                return true;
            }
        }

        if (getPlayer().getHealth()==0){
            System.out.println("\n\nRIP "+getPlayer().getName());
            return false;
        }



        return true;
    }


    public int randomMob(){
        Random r = new Random();
        int mobNumber =r.nextInt(getMaxMob()-getMinMob())+getMinMob();
        return mobNumber;
    }
    public int attackChance(){
        Random rnd = new Random();
        return rnd.nextInt(2);
    }
    public boolean combat(int mobNumber){
        int mobCount=0;
        for (int i=1;i<=mobNumber;i++){
            getMob().setMobHealth(getMob().getDefaultmobHealth());
            playerStats();
            System.out.println();
            mobStats();
            while (this.getPlayer().getHealth()>0&&this.getMob().getMobHealth()>0){
                int attackChance = attackChance();
                System.out.println("<a>ttack or <r>un away: ");
                String selectOp = in.nextLine().toUpperCase();
                if (selectOp.equals("A")){
                    if (attackChance==1){
                        System.out.println("You attacked");
                        this.getMob().setMobHealth(this.getMob().getMobHealth()-this.getPlayer().getTotalDamage());
                        afterHit();
                        if (getMob().getMobHealth()>0){
                            System.out.println();
                            System.out.println(getMob().getMobName()+" is attacked");
                            int totalmobDamage=getMob().getMobDamage()-getPlayer().getInventory().getArmors().getDefence();
                            if (totalmobDamage<0){
                                totalmobDamage=0;
                            }
                            getPlayer().setHealth(getPlayer().getHealth()-totalmobDamage);
                            afterHit();

                        }
                        else if (getMob().getMobHealth()<=0){
                            System.out.println("You have defeated "+i+". "+getMob().getMobName());
                            if (getMob().getMobName().equals("Snake")&&getMob().isIsdropRandom()){
                                randomDrop();
                            }else {
                                getPlayer().setGold(getPlayer().getGold()+getMob().getMobDrop());
                                System.out.println("You have "+getPlayer().getGold()+" gold now!");
                                System.out.println();
                            }

                        }
                    }
                    else if (attackChance==0){
                        if (getMob().getMobHealth()>0){
                            System.out.println();
                            System.out.println(getMob().getMobName()+" is attacked");
                            int totalmobDamage=getMob().getMobDamage()-getPlayer().getInventory().getArmors().getDefence();
                            if (totalmobDamage<0){
                                totalmobDamage=0;
                            }
                            getPlayer().setHealth(getPlayer().getHealth()-totalmobDamage);
                            afterHit();

                        }
                        System.out.println("You attacked");
                        this.getMob().setMobHealth(this.getMob().getMobHealth()-this.getPlayer().getTotalDamage());
                        afterHit();
                        if (getMob().getMobHealth()<=0){
                            System.out.println("You have defeated "+i+". "+getMob().getMobName());
                            if (getMob().getMobName().equals("Snake")&&getMob().isIsdropRandom()){
                                randomDrop();
                            }else {
                                getPlayer().setGold(getPlayer().getGold()+getMob().getMobDrop());
                                System.out.println("You have "+getPlayer().getGold()+" gold now!");
                                System.out.println();
                            }

                        }
                    }

                }
                else if (selectOp.equals("R")){
                    System.out.println("YOU ARE A COWARD!");
                    return false;
                }
            }
            mobCount++;


    
        }
        if (mobCount==mobNumber&&getMob().getMobHealth()<=0){
            return true;
        }
        return false;
    }
    public void afterHit(){
            System.out.println("Your Health: "+
                    this.getPlayer().getHealth()+
                    " "+this.getMob().getMobName()+"'s health: "+
                    this.getMob().getMobHealth() );
        }
    public  void randomDrop(){

        int dropChance = rnd.nextInt(100)+1;
        if (dropChance>0&&dropChance<15){
            int weaponChance = rnd.nextInt(100)+1;
            if (weaponChance>0&&weaponChance<20){
                getPlayer().getInventory().setWeapons(Weapons.getWeaponObjByID(3));
                System.out.println("Snake dropped "+ getPlayer().getInventory().getWeapons().getName()+" you've got lucky!");
                System.out.println("Current weapon: "+getPlayer().getInventory().getWeapons().getName());

            } else if (weaponChance>20&&weaponChance<50) {
                getPlayer().getInventory().setWeapons(Weapons.getWeaponObjByID(1));
                System.out.println("Snake dropped "+ getPlayer().getInventory().getWeapons().getName()+" you've got lucky!");
                System.out.println("Current weapon: "+getPlayer().getInventory().getWeapons().getName());
            } else if (weaponChance>50&&weaponChance<100) {
                getPlayer().getInventory().setWeapons(Weapons.getWeaponObjByID(2));
                System.out.println("Snake dropped "+ getPlayer().getInventory().getWeapons().getName()+" you've got lucky!");
                System.out.println("Current weapon: "+getPlayer().getInventory().getWeapons().getName());
            }
        }
        else if (dropChance>15&&dropChance<30){
            int armorChance = rnd.nextInt(100)+1;
            if (armorChance>0&&armorChance<20){
                getPlayer().getInventory().setArmors(Armors.getArmorObjById(3));
                System.out.println("Snake dropped "+ getPlayer().getInventory().getArmors().getName()+" you've got lucky!");
                System.out.println("Current armor: "+getPlayer().getInventory().getArmors().getName());
            } else if (armorChance>20&&armorChance<50) {
                getPlayer().getInventory().setArmors(Armors.getArmorObjById(1));
                System.out.println("Snake dropped "+ getPlayer().getInventory().getArmors().getName()+" you've got lucky!");
                System.out.println("Current armor: "+getPlayer().getInventory().getArmors().getName());
            } else if (armorChance>50&&armorChance<100) {
                getPlayer().getInventory().setArmors(Armors.getArmorObjById(2));
                System.out.println("Snake dropped "+ getPlayer().getInventory().getArmors().getName()+" you've got lucky!");
                System.out.println("Current armor: "+getPlayer().getInventory().getArmors().getName());
            }
        } else if (dropChance>30&&dropChance<55) {
            int moneyChance = rnd.nextInt(100)+1;
            if (moneyChance>0&&moneyChance<20){
                getPlayer().setGold(getPlayer().getGold()+10);
                System.out.println("Snake dropped 10 gold youve got lucky!");
                System.out.println("Balance: "+getPlayer().getGold());
            } else if (moneyChance>20&&moneyChance<50) {
                getPlayer().setGold(getPlayer().getGold()+5);
                System.out.println("Snake dropped 5 gold youve got lucky!");
                System.out.println("Balance: "+getPlayer().getGold());
            }else if (moneyChance>50&&moneyChance<100) {
                getPlayer().setGold(getPlayer().getGold()+1);
                System.out.println("Snake dropped 1 gold youve got lucky!");
                System.out.println("Balance: "+getPlayer().getGold());
            }
        } else if (dropChance>55&&dropChance<100) {
            System.out.println("Sorry mate youve got nothin but a heart break :D");
        }
    }
    public Mob getMob() {
        return mob;
    }

    public void setMob(Mob mob) {
        this.mob = mob;
    }
}
