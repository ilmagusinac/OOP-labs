package Week10.LectureCode.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesIO {
    public static void main(String[] args){

    }

    public static void createFile(){
        try{
            File file = new File("example.txt");
            //method is a method in Java that is used to create a new, empty file.
            // This method is part of the java.io.File class, which is commonly used for file-related operations.
            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());
            } else{
                System.out.println("File already exists.");
            }
        } catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

    public static void createFileNio(){
        try{
            //Paths class from the java.nio.file package in Java to obtain a Path object representing the file "example.docx".
            // The Paths.get(...) method is a factory method for creating Path instances.
            Path path = Paths.get("example.docx");
            Files.createFile(path);
            System.out.println("File created: " + path.getFileName());
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    public static void writeToFile(){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("example.csv"));
            bufferedWriter.write("Hello this is a sample text.");
            bufferedWriter.close();
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    public static void readFromFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("example.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void deleteFile(){
        File file = new File("example.txt");
        if(file.delete()){
            System.out.println("File deleted: " + file.getName());
        }else{
            System.out.println("Failed to delete the file");
        }
    }
}

