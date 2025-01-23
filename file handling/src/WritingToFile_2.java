import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile_2 {
    public static void main(String[] args) {
        //for writing to a file we will use the class FileWriter
        try {
            File myFile=new File("one.txt");
//            FileWriter writer = new FileWriter("example.txt");  if file doesn't exist,it will automatically create a new file
              FileWriter writer=new FileWriter("one.txt");
            writer.write("Hello, world!\n");
            writer.write("This is a file handling example in Java.");
            writer.close();
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
