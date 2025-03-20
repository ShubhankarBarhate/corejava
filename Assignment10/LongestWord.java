
import java.io.*;
import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
       
        String filePath = "path_to_your_file.txt"; 

        
        String longestWord = "";

        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                
                String[] words = line.split("W+"); 

                
                for (String word : words) {
                   
                    if (word.length() > longestWord.length()) {
                        longestWord = word; 
                    }
                }
            }

            
            if (!longestWord.isEmpty()) {
                System.out.println("The longest word in the file is: " + longestWord);
            } else {
                System.out.println("No words found in the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
