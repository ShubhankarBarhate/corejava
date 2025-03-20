import java.util.HashSet;
import java.util.LinkedHashSet;
public class HashsetToLinkedHashset {
    public static void main(String[] args) {
        
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        
        
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(hashSet);
        
       
        System.out.println("Elements in LinkedHashSet (order of insertion maintained):");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }
}