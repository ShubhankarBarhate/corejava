
import java.util.ArrayList;

public class ReplaceElement {
    public static void main(String[] args) {
       
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Blue");

        
        System.out.println("Before replacing the second element: " + colors);

       
        if (colors.size() >= 2) {
            
            colors.set(1, "Purple");
        } else {
            System.out.println("The list doesn't have enough elements.");
        }

        
        System.out.println("After replacing the second element: " + colors);
    }
}
