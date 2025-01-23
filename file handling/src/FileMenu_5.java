import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMenu_5 {
    public static void main(String[] args) {
         //this program will brush up all important file handling concepts
         while(true){
            Scanner sc=new Scanner(System.in);
             System.out.println("Welcome to File Handling in Java");
             System.out.println("Press 1 for creating a new file");
             System.out.println("Press 2 for writing to a file");
             System.out.println("Press 3 for reading a file");
             System.out.println("Press 4 for deleting a file");
             System.out.println("Press 5 for exiting");
             int option=sc.nextInt();
             sc.nextLine(); //consume the next line
             switch (option){
                 case 1:{
                     //CREATING A NEW FILE
                     String filename;
                     System.out.println("Enter the name of the file you want to create");
                     filename=sc.nextLine();
                     File newFile=new File(filename);
                     try{
                         if(newFile.createNewFile()){
                             System.out.println("File created successfully");
                         }else{
                             System.out.println("An error occurred while creating a new file");
                         }
                     }catch (IOException e){
                         System.out.println("An exception occurred while creating a new File");
                     }
                     break;
                 }

                 case 2:{
                     //WRITING TO A FILE
                     String filename;
                     System.out.println("Enter the name of the file you want to write to");
                     filename=sc.nextLine();
                     try{
                         FileWriter writer=new FileWriter(filename,true); //provided an extra parameter true so that we can append to the file as well
                         System.out.println("Enter text to write");
                         String text=sc.nextLine();
                         writer.write(text+"\n");
                         writer.close();
                         System.out.println("Text written to the file successfully");
                     }catch (IOException e){
                         System.out.println("An error occurred while writing to file: "+filename);
                     }
                     break;

                 }
                 case 3: {
                     //READING FROM A FILE
                     System.out.print("Enter file name: ");
                     String fileName = sc.nextLine();
                     try {
                         File file = new File(fileName);
                         Scanner fileReader = new Scanner(file);
                         while (fileReader.hasNextLine()) {
                             System.out.println(fileReader.nextLine());
                         }
                         fileReader.close();
                     } catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                     }
                     break;
                 }
                 case 4: {
                     //DELETING A FILE
                     System.out.print("Enter file name: ");
                     String fileName = sc.nextLine();
                     File file = new File(fileName);
                     if (file.delete()) {
                         System.out.println("File deleted.");
                     } else {
                         System.out.println("Failed to delete the file.");
                     }
                     break;
                 }
                 case 5:
                     System.out.println("Exiting...");
                     sc.close();
                     return;
                 default:
                     System.out.println("Invalid choice. Try again.");
             }
             }
         }
    }

