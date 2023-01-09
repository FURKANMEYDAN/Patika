import com.sun.source.tree.WhileLoopTree;

import javax.swing.plaf.synth.SynthUI;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Player {
    private int damage;

    private int health;
    private int gold;
    private int defence;

    private String name;
    private int defaultplayerHealth;
    private int totalDamage;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name; this.inventory=new Inventory();
    }

    public int getTotalDamage() {
        return totalDamage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setTotalDamage(int totalDamage) {
        this.totalDamage = totalDamage;
    }

    public  void selectChar(){

        Characters[] character = {new Samurai(),new Archer(),new Knight()};
        for(Characters c: character){
            System.out.println("-------------------------------------------------------");
            System.out.println("ID:\t"+c.getId()+"\tCharacter: \t"+c.getName()+"\tDamage: "+c.getDamage()+"\tHealth: "+c.getHealth()+"\tGold: "+c.getGold());
        }
        System.out.println("-------------------------------------------------------");
        boolean isValid=false;
        System.out.println();
        System.out.println("Please select a character: ");

        while (isValid==false){
            String cpy = input.nextLine();

            try {
                int selectChar=Integer.parseInt(cpy);
                isValid=true;
                switch (selectChar){
                    case 1:
                        initChar(new Samurai());
                        System.out.println("You have chose the SAMURAI");
                        printInfo();
                        break;
                    case 2:
                        initChar(new Archer());
                        System.out.println("You have chose the ARCHER");
                        printInfo();
                        break;
                    case 3:
                        initChar(new Knight());
                        System.out.println("You have chose the Test");
                        printInfo();
                        break;
                    default:
                        System.out.println("You have entered a incorrect id please chose wisely!");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter an integer!");
            }
        }


    }
    public void initChar(Characters character){
        this.setDamage(character.getDamage());
        setTotalDamage(getDamage());
        this.setDefaultplayerHealth(character.getHealth());
        this.setHealth(character.getHealth());
        this.setGold(character.getGold());
    }

    public int getDefaultplayerHealth() {
        return defaultplayerHealth;
    }

    public void setDefaultplayerHealth(int defaultplayerHealth) {
        this.defaultplayerHealth = defaultplayerHealth;
    }

    public void selectLoc(){

        while (true) {
            boolean isValid=false;
            Location location = null;
            System.out.println();
            System.out.println("Locations");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1-SafeHouse\t" +
                    "(Your health will be restored here)\n2-ItemShop\t" +
                    "(You can buy stuff)\n3-Cave\t\t(Reward:Coal)\n4-River\t\t" +
                    "(Reward:Water)\n5-Forest\t(Reward:Firewood)\n6-Mine\t\t(Mobs will drop items/gold no reward here!)\n7-Exit Game");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Please select a location:");
            while (isValid==false) {
                    String cpy = input.nextLine();
                    try {

                        int selectLoc=Integer.parseInt(cpy);
                        isValid=true;
                        switch (selectLoc) {
                            case 1:
                                location = new SafeHouse(this);
                                break;
                            case 2:
                                location = new ItemShop(this);
                                break;
                            case 3:
                                location = new Cave(this);
                                printInfo();
                                break;
                            case 4:
                                location = new River(this);
                                printInfo();
                                break;
                            case 5:
                                location = new Forest(this);
                                printInfo();
                                break;

                            case 6:
                                location = new Mine(this);
                                printInfo();
                                break;
                            case 7:
                                System.out.println("YOU ARE A LOSER!");
                                return;
                            default:
                                System.out.println("You have entered incorrect id please chose wisely!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter an integer!");
                    }
                }


            if (!location.onLocation()){

                return;
            }
        }
    }
    public void printInfo(){
        System.out.println("Weapon: "+getInventory().getWeapons().getName());
        System.out.println("Armor: "+getInventory().getArmors().getName());
        System.out.println("Totaldamage: "+this.getTotalDamage());
        System.out.println("Defence "+getInventory().getArmors().getDefence());
        System.out.println("Gold:"+getGold());
        System.out.println("Current quest item: "+getInventory().getQuestItems().getName());
    }
    public int getDamage() {
        return damage;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (health<0){
            this.health=0;
        }
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
