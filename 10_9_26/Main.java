import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static <Etype> int findElementIdx(Etype[] arr, Etype element){
        for (int i =0; i < arr.length;i++){
            if (arr[i].equals(element)){
                return i;
            }
        }
        return -1;
    } 
    public static <EType1, EType2> void printArrays(EType1[] array1, EType2[] array2){
        if (array1.length != array2.length){
            return;
        }
        for (int i = 0; i < array1.length;i++){
            System.out.println(array1[i] + " " + array2[i]);
        }
    }
    public static <Etype extends Comparable<Etype>> void printCompare(Etype a, Etype b){
        if (a.compareTo(b) < 0){
            System.out.println("Less");
        } else if (a.compareTo(b) > 0) {
            System.out.println("More");
        } else{
        System.out.println("Equal");
        }
    }

    public static <EType extends Number & Comparable<EType>> double computeDistance(EType x1, EType y1, EType x2, EType y2){
        double xDistance = Math.pow(x2.doubleValue() - x1.doubleValue(),2);
        double yDistance = Math.pow(y2.doubleValue() - y1.doubleValue(),2);

        double result = Math.sqrt(xDistance+yDistance);
        return result;
    }
    public static void main(String[] args){
        // Integer[] intArr = {1,3,5};
        // String[] strArr = {"Alex","Max","Chelsea"};

        // System.out.println(findElementIdx(intArr, 5));
        // System.out.println(findElementIdx(strArr, "Max"));

        // printArrays(intArr,strArr);

        // String str1 = "Alex";
        // String str2 = "alex";

        // printCompare(str1,str2);
        
        // System.out.println(computeDistance(0,0,2.4,3.8));

        // 
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(5);
        intList.add(12);
        intList.add(3);
        System.out.println(intList.toString());
        Collections.sort(intList);
        System.out.println(intList.toString());
        
        ArrayList<Pair<Integer>> pairList = new ArrayList<Pair<Integer>>();
        pairList.add(new Pair<Integer>(4,2));
        pairList.add(new Pair<Integer>(2,7));
        Collections.sort(pairList);

    }
}