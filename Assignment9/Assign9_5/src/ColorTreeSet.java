
import java.util.*;

public class ColorTreeSet {
    public static void main(String[] args) {
        
        Set<String> colors = new TreeSet<>();

        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Purple");

      
        System.out.println("Colors in the TreeSet (sorted order):");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

