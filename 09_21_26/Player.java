import java.util.ArrayList;
public class Player implements Unit {
    protected int[] position;
    protected String name;
    protected String job;

    public Player(int x, int y, String userName, String job){
        position = new int[2];
        position[0] = x;
        position[1] = y;
        name = userName;
        this.job = job; 
    }
    public void move(int userX, int userY){
        position[0] = userX;
        position[1] = userY;
    }
    public void attack(){
        if (job == "rogue"){
            // do rogue attack
            System.out.println("Knifing");
        } else if (job == "mage"){
            // do magic attack
            System.out.println("Magic attack!");
        }
    }
    public void talk(){
        System.out.println("Huzzah");
    }

    public void defend(){
        //do some defense
        System.out.println("Blocking");
    }
    public static void main(String[] args){
        ArrayList<Unit> characters = new ArrayList<Unit>();
        Player player = new Player(10,5,"Maximus","mage");
        // player.attack();
        characters.add(player);
        Enemy enemy = new Enemy(5,10,"Troll");
        characters.add(enemy);

        for(int i = 0; i < characters.size(); i++){
            Unit unit = characters.get(i);
            unit.attack();
            if (unit instanceof Player){
                // Player u = (Player) unit;
                // u.talk();
                unit.talk();
            }
            // unit.talk();
        }
    }
}
