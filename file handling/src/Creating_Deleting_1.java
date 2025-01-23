import java.io.File;
import java.io.IOException;

public class Creating_Deleting_1 {
    public static void main(String[] args) {
        File myfile=new File("example.txt"); //whenever creating a new file give name as an argument
        try {
            //Creating a file
            if(myfile.createNewFile()){
                System.out.println("new file created "+myfile.getName());
            }else{
                System.out.println("file already exists");
            }
            // Delete the file
            if (myfile.delete()) {
                System.out.println("File deleted: " + myfile.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }

        }catch (IOException e){
            System.out.println("Exception occurred");
        }
    }

}
