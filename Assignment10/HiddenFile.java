
import java.io.File;

public class HiddenFile {
    public static void main(String[] args) {
        
        String directoryPath = "path_to_your_directory";  

        
        File directory = new File(directoryPath);

        
        if (directory.exists() && directory.isDirectory()) {
           
            File[] files = directory.listFiles();

            if (files != null) {
               
                for (File file : files) {
                   
                    if (file.isHidden()) {
                        System.out.println(file.getName() + " is a hidden file.");
                    } else {
                        System.out.println(file.getName() + " is not a hidden file.");
                    }
                }
            } else {
                System.out.println("The directory is empty or cannot be read.");
            }
        } else {
            System.out.println("The specified path is not a valid directory.");
        }
    }
}
