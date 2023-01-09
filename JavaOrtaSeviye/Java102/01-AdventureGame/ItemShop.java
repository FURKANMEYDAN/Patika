import jdk.jshell.Snippet;

import java.util.Scanner;

public class ItemShop extends NormalLoc{
    public static Scanner input = new Scanner(System.in);

    public ItemShop(Player player) {
        super(player, "Item Shop");
    }

    @Override
   public boolean onLocation() {
            System.out.println("Welcome to Item Shop!");
            System.out.println("==================================================================");
            System.out.println("1-Weapons");
            System.out.println("2-Armors");
            System.out.println("3-Exit");
            System.out.println("Please select item that you want it: ");
            int itemChoice = input.nextInt();
            switch (itemChoice) {
                case 1:
                    System.out.println("You have "+getPlayer().getGold()+" gold");
                    System.out.println();
                    printWeapons();
                    System.out.println("Enter '0' to exit");
                    buyWeapon();
                    break;
                case 2:
                    System.out.println("You have "+getPlayer().getGold()+" gold");
                    System.out.println();
                    printArmors();
                    System.out.println("Enter '0' to exit");
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Until then!");
                    break;
                default:
                    System.out.println("Please try again!");

            }
            return true;
    }

    public  void printWeapons(){
        for (Weapons w:Weapons.weapons()) {
            System.out.println("ID:\t" + w.getId() +
                    " WeaponName:\t" + w.getName() +
                    " Damage:\t" + w.getDamage() +
                    " Price:\t" + w.getPrice());
            }


        }
    public  void printArmors(){
        for (Armors a:Armors.armors()){
            System.out.println("ID: \t"+a.getId()+
                    "ArmorName:\t"+a.getName()+
                    "\tDefence\t"+a.getDefence()+
                    "\tPrice: \t"+a.getPrice());
        }

    }
    public void buyWeapon(){
        System.out.println("Please choose a weapon: ");
        int selectWeapon = input.nextInt();
        if (selectWeapon==0){
            return;
        }
        while (selectWeapon<1||selectWeapon>Weapons.weapons().length){
            System.out.println("You have entered incorrect id please try again!");
            selectWeapon=input.nextInt();
        }
        Weapons selectedWeapon = Weapons.getWeaponObjByID(selectWeapon);
        if (selectedWeapon!=null){
            if (this.getPlayer().getGold()<selectedWeapon.getPrice())System.out.println("Not enough gold to buy this item!");
            else {
                this.getPlayer().setGold(this.getPlayer().getGold()-selectedWeapon.getPrice());
                this.getPlayer().getInventory().setWeapons(selectedWeapon);
                System.out.println(selectedWeapon.getName()+" is equipped\n"+
                        "you have "+this.getPlayer().getGold()+" gold remaining");
                getPlayer().setTotalDamage(getPlayer().getDamage()+getPlayer().getInventory().getWeapons().getDamage());
                System.out.println("Weapon:"+getPlayer().getInventory().getWeapons().getName()+"Total damage: "+getPlayer().getTotalDamage());
            }
        }
    }
    public void buyArmor(){

        System.out.println("Please select an armor: ");
        int selectArmor=input.nextInt();
        if (selectArmor==0){
            return;
        }
        Armors selectedArmor = Armors.getArmorObjById(selectArmor);
        while (selectArmor<1||selectArmor>Armors.armors().length){
            System.out.println("You have entered incorrect id please try again !");
            selectArmor=input.nextInt();
        }
        if (selectedArmor!=null);
        if (this.getPlayer().getGold()<selectedArmor.getPrice())System.out.println("Not enough gold to buy this item!");
        else{
            this.getPlayer().setGold(this.getPlayer().getGold()-selectedArmor.getPrice());
            System.out.println("You have "+this.getPlayer().getGold()+" gold remaining ");
            this.getPlayer().getInventory().setArmors(selectedArmor);
            System.out.println(selectedArmor.getName()+" is equipped");
            getPlayer().setDefence(getPlayer().getInventory().getArmors().getDefence());
            System.out.println("Armor: "+this.getPlayer().getInventory().getArmors().getName()+
                    "\tDefence: "+getPlayer().getDefence());
        }


    }


}
