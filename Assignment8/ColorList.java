
import java.util.ArrayList;
import java.util.Collections;


public class ColorList {
    public static void main(String[] args) {
        
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the list
        colors.add("Aqua");
        colors.add("Orange");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Grey");

        
        Collections.sort(colors);

        
        System.out.println("Sorted List of Colors:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}