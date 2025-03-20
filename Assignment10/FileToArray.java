import java.io.*;
import java.util.*;

public class FileToArray {
    public static void main(String[] args) {
        
        String filePath = "path_to_your_file.txt";  

        
        List<String> linesList = new ArrayList<>();

        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                linesList.add(line); 
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

       
        String[] linesArray = linesList.toArray(new String[0]);

        
        System.out.println("Content of the file:");
        for (String line : linesArray) {
            System.out.println(line);
        }
    }
}
