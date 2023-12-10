package Week10.LectureCode.files;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class FileIO {
    //LECTURE EXAMPLES
    public static void simpleWrite(String text) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("output.txt")
        );
        bufferedWriter.write("Our first line \n");
        bufferedWriter.close();
    }

    public static void arrayFileWrite(String[] data) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("output.txt")
        );

        for (String row : data)
            bufferedWriter.write("\n" + row);

        bufferedWriter.close();
    }

    public static void simpleRead() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("output.txt")
        );
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
    }

    //.lines() method returns a Stream<String> of lines read from the Reader, each element in the stream represents a line from the input
    //.collect(Collectors.toList()) terminal operation that collects the elements of the stream into a List
    //Collectors.toList() method collector that accumulates the elements of the stream into a new "List"
    public static void readWholeFileList() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("output.txt")
        );
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());

        for (String line : lines)
            System.out.println(line);

        bufferedReader.close();
    }

    public static void readWholeFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("output.txt")
        );
        String tempLine;
        while ((tempLine = bufferedReader.readLine()) != null){
            System.out.println(tempLine);
        }

        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException {
        String[] names = {"John", "Tommy", "Emma"};
        arrayFileWrite(names);
        readWholeFile();
        readWholeFileList();
    }

    //CODE WITH JOHN - examples
    /*
    public static void main(String[] args) {
        // buferedwriter can write to many different things but the file is
        // just one of them, that is why it need a parameter
        // we will write to a file
        // file writer needs to have a parameter as well
        // this construct --> file writer needs to have a IOException here, in try-catch or in the main method

        String[] names = {"John", "Carl", "Jerry"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("codewithjohn.txt"));
            //to write to a file we need to call our writer object and pass the string
            writer.write("Writting to a file.");
            writer.write("\nHere is another line.");

            for(String name: names){
                writer.write("\n" + name);
            }
            writer.close(); // if we forget this our file will be created but nothing will be written to it
        } catch (IOException e) {
            e.printStackTrace();
        }

        //reading from a file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("codewithjohn.txt"));
            //reading a line - myb sometimes we would like to save it into some variable
            //reader.readLine();
            String line;
            while((line = reader.readLine())!=null) { //read a text from a file out it in a line variable it its not null we wil read the line
                System.out.println(line);
            }

            //System.out.println(reader.readLine());
            reader.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
     */

}
