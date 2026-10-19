import java.lang.Comparable;
public class Pair<ItemType extends Comparable> implements Comparable<Pair<ItemType>>{
    ItemType value1;
    ItemType value2;

    public Pair(ItemType a, ItemType b){
        value1 = a;
        value2 = b;
    }

    public void print(){
        System.out.println(value1 + " " + value2);
    }
    public int compareTo(Pair<ItemType> b){
        return -1;
    }
}

