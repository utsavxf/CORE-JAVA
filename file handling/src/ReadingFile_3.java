import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadingFile_3 {
    public static void main(String[] args) {
        //here we will make use of Scanner Object to read from a file
        //and also learn about a new Exception which is FileNotFoundException

                try {
                    File Obj = new File("one.txt");
                    Scanner Reader = new Scanner(Obj);

                    // Traversing File Data
                    while (Reader.hasNextLine()) {
                        String data = Reader.nextLine(); //reads the whole next line
                        System.out.println(data);
                    }

                    Reader.close();
                }

                // Exception Cases
                catch (FileNotFoundException e) {
                    System.out.println("An error has occurred.");
                    e.printStackTrace();
                }
            }
        }
