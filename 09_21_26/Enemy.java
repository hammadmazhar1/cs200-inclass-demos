public class Enemy implements Unit {
    protected int[] position;
    protected String type;


    public Enemy(int x, int y, String userType){
        position = new int[2];
        position[0] =x;
        position[1] =y;
        type= userType;
    }
    public void move(int userX, int userY){
        // implement enemy pathing
    }
    public void attack(){
        if (type == "Troll"){
            System.out.println("Its clobbering time!");
        } else if (type == "Harpy"){
            System.out.println("Shriek!!!!");
        }
    }
    public void defend(){
        System.out.println("NO DEFENDING!");
    }
}
