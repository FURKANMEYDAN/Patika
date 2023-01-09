public class QuestItems {
    private int id;
    private String name;


    public QuestItems(int id,String name) {
        this.id=id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static QuestItems[] questItems(){
        QuestItems[] questItems = new QuestItems[4];
        questItems[0]=new QuestItems(1,"Coal");
        questItems[1]=new QuestItems(2,"Water");
        questItems[2]=new QuestItems(3,"Firewood");
        questItems[3]=new QuestItems(4,"This  is arena so you cannot have any quest item here! RELAX");
        return questItems;
    }
    public static QuestItems getQuestObjByID(int id){
        for (QuestItems q:QuestItems.questItems()){
            if (q.getId()==id){
                return q;
            }
        }
        return null;
    }
}
