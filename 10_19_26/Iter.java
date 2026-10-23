import java.util.ArrayList;

public class Iter{

    public static void main(String[] args){
        ArrayList<Integer> data = new ArrayList<Integer>();

        data.add(11);
        data.add(13);
        data.add(21);
        data.add(-12);

        for (int i =0; i < data.size();i++){
            System.out.println(data.get(i));
        }

        for (Integer i: data){
            System.out.println(i);
        }
    }
}