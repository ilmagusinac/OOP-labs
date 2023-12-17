package Week11.LectureCode.Exception;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int numberParsed = getParsedInt("myInt");
            System.out.println("This will not be written to the console");
        } catch (NumberFormatException nfe){
            System.out.println("Unable to cast string to integer");
        } catch (NullPointerException npe) {
            System.out.println("The NullPointer has been thrown");
        } finally {
            System.out.println("I'm always executed");
        }
    }

    public static int getParsedInt(String stringNumber){
        int numberParsed = Integer.parseInt(stringNumber);
        return numberParsed;
    }

    public static int multiCatchParse(String stringNumer) {
        try {
            int numberParsed = getParsedInt("myInt");
            return numberParsed;
        } catch (NumberFormatException | NullPointerException e){
            System.out.println("Problem happened");
        }
        return 0;
    }

    public static int finallyExample(){
        try {
            return 1;
        } catch (Exception e){
            return 2;
        } finally {
            return 3;
        }
    }
}

/*
public class Exception extends Throwable {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("output.txt");
        //readFile("output"); //will throw an error -> we didn't specify the right filename
        readFileThrowable("output.txt");
        //readFileThrowable("output"); //will throw an error
        //printLength(null); //NullPointerException

        //int number = Integer.parseInt("myint"); //NumberFormatException

        try{
            int numberParsed = Integer.parseInt("myint");
        }catch(NumberFormatException exception){
            System.out.println("Unable to cast");
        }

        try{
            int numberParsed = getParsedInt("myint");
        }catch(NumberFormatException exception){
            System.out.println("Unable to cast string to integer");
        }

        multiCatchParse("stringNumber");

        try{
            int numberParsed = getParsedInt("myInt");
            System.out.println("This will not be written to the console");
        }catch(NumberFormatException nfe){
            System.out.println("Unable to cast string to integer");
        }catch(NullPointerException npe){
            System.out.println("The NullPointer exception");
        }finally{ //it will always be executed
            System.out.println("I'm allways executed");
        }


        System.out.println(finallyExample());


    }
    public static int finallyExample(){
        try {
            return 1;
        } catch (NumberFormatException e){ //Exception e -> Custom exception
            return 2;
        } finally {
            return 3;
        }
    }



    public static int getParsedInt(String stringNumber){
        int numberParsed = Integer.parseInt(stringNumber);
        return numberParsed;
    }

    public static int multiCatchParse(String stringNumber){
        try{
            int numberParsed = getParsedInt(stringNumber);
            return numberParsed;
        }catch(NumberFormatException | NullPointerException e){
            System.out.println("Errors");

        }
        return 0;
    }
    public static void readFile(String fileName){
        try{
            FileReader reader = new FileReader(fileName);

        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    public static void readFileThrowable(String fileName) throws FileNotFoundException{
        FileReader reader = new FileReader(fileName);

    }

    public static void printLength(String myString){
        System.out.println(myString.length());
    }

}

 */
