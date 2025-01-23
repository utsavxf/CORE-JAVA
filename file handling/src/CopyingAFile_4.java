import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class CopyingAFile_4 {
    public static void main(String[] args) {
        //we will use Files class here to copy the file
        Path source = Paths.get("one.txt");
        Path destination = Paths.get("two.txt");

        try {
            Files.copy(source, destination);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
        }
    }
}
