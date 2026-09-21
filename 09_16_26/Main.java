import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        // String[][] data = new String[5][5];

        // data[0][0] = "Ford";
        // data[0][1] = "Chevrolet";
        // data[1][0] = "GMC";

        // System.out.println(Arrays.deepToString(data));
        // Scanner scnr = new Scanner(System.in);
        // int rowDim = scnr.nextInt();
        // int colDim = scnr.nextInt();

        // int[][] data = new int[rowDim][colDim];

        // System.out.println(Arrays.deepToString(data));
        // int[] array = new int[10];
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        System.out.println(list.toString());
        list.add(12);
        list.add(13);
        System.out.println(list.toString());
        list.add(1, -16);
        System.out.println(list.toString());
        list.set(0,-10);
        System.out.println(list.toString());
        list.remove((Object)13);
        System.out.println(list.toString());
        System.out.println(list.indexOf(32));
        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.add(13);
        list.add(0,13);
        System.out.println(list.toString());
        System.out.println(list.remove((Object)13));
        System.out.println(list.toString());

    }   
}
