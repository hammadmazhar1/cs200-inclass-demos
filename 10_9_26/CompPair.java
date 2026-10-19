import java.lang.Comparable;
public class CompPair<ItemType1 extends Comparable<ItemType1>, ItemType2 extends Comparable<ItemType2>> implements Comparable<CompPair<ItemType1,ItemType2>> {
    ItemType1 value1;
    ItemType2 value2;

    public CompPair(ItemType1 a, ItemType2 b){
        value1 = a;
        value2 = b;
    }
    public int compareTo(CompPair<ItemType1,ItemType2> b){
        if (value1.compareTo(b.value1) < 0){
            return -1;
        } else if (value1.compareTo(b.value1) > 0){
            return 1;
        } else{
            if (value2.compareTo(b.value2) < 0){
                return -1;
            } else if (value2.compareTo(b.value2) > 0){
                return 1;
            } else{
                return 0;
            }
        }
    } 

    public void print(){
        System.out.println(value1 + " " + value2);
    }
}

