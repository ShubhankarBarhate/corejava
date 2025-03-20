import java.io.File;

public class FileDiectory {
    public static void main(String[] args) {
       
        String pathname = "path_to_your_file_or_directory";  

        
        File file = new File(pathname);

        
        if (file.exists()) {
            System.out.println("The path exists.");

            
            if (file.isFile()) {
                System.out.println("It is a file.");
            }
            
            else if (file.isDirectory()) {
                System.out.println("It is a directory.");
            }
        } else {
            System.out.println("The path does not exist.");
        }
    }
}