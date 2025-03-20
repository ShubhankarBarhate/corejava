import java.util.*;

public class ListMaxNumber {

    
    public static <T extends Number & Comparable<T>> T findMax(List<T> list) {
        
        if (list == null || list.isEmpty()) {
            return null; 
        }

        T max = list.get(0); 
        for (T num : list) {
            if (num.compareTo(max) > 0) { 
                max = num; 
            }
        }
        return max; 
    }

    public static void main(String[] args) {
        
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 8, 5));
        List<Double> doubleList = new LinkedList<>(Arrays.asList(1.5, 2.8, 3.7, 0.9));
        List<Float> floatList = new Vector<>(Arrays.asList(5.6f, 1.2f, 8.3f, 2.4f));

        System.out.println("Max in Integer List: " + findMax(intList)); 
        System.out.println("Max in Double List: " + findMax(doubleList)); 
        System.out.println("Max in Float List: " + findMax(floatList)); 
    }
}
