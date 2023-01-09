import java.util.Random;

public class Mob {
    private int mobNumber;
    private int mobDrop;

    private boolean isdropRandom;

    private String mobName;
    private int mobDamage;
    private int mobHealth;
    private int defaultmobHealth;


    public Mob(String mobName, int mobDamage, int mobHealth, int mobDrop,boolean isdropRandom) {

        this.mobName = mobName;
        this.mobDamage = mobDamage;
        this.mobHealth = mobHealth;
        this.mobDrop = mobDrop;
        this.defaultmobHealth=mobHealth;
        this.isdropRandom=isdropRandom;


    }


    public boolean isIsdropRandom() {
        return isdropRandom;
    }

    public void setIsdropRandom(boolean isdropRandom) {
        this.isdropRandom = isdropRandom;
    }

    public int getDefaultmobHealth() {
        return defaultmobHealth;
    }

    public void setDefaultmobHealth(int defaultmobHealth) {
        this.defaultmobHealth = defaultmobHealth;
    }

    public int getMobDrop() {
        return mobDrop;
    }

    public void setMobDrop(int mobDrop) {
        this.mobDrop = mobDrop;
    }

    public String getMobName() {
        return mobName;
    }

    public void setMobName(String mobName) {
        this.mobName = mobName;
    }

    public int getMobDamage() {
        return mobDamage;
    }

    public void setMobDamage(int mobDamage) {
        this.mobDamage = mobDamage;
    }

    public int getMobHealth() {
        return mobHealth;
    }

    public void setMobHealth(int mobHealth) {
        this.mobHealth = mobHealth;
        if (mobHealth<0){
            this.mobHealth=0;
        }
    }

    public int getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(int mobNumber) {
        this.mobNumber = mobNumber;
    }
}
