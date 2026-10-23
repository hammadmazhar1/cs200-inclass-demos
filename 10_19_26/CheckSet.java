import java.util.HashSet;
public class CheckSet {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<Integer>();


    set.add(10);
    set.add(12);
    set.add(13);
    


    System.out.println(set.contains(11));
    System.out.println(set.contains(12));



  }   
}
