package Week11.CodeWithJohn;

public class ExceptionHandling {
    public static void main(String[] args){
        //int myInt = Integer.parseInt("pants");
/*
        try{
            int myInt = Integer.parseInt("pants");
        }catch(NumberFormatException nfe){
            System.out.println("Hey dude you can't");
        }
        System.out.println("End here");


        try{
            int myInt = Integer.parseInt("pants");
        }catch(Exception e){ //catch any type of exception
            //call stack: throw exception goes up to the call stack until is caught by a catch statement
            System.out.println("Hey dude you can't");
        }
        System.out.println("End here");


        try{
            getInt();
        }catch(Exception e){ //catch any type of exception
            //call stack: throw exception goes up to the call stack until is caught by a catch statement
            System.out.println("Hey dude you can't");
        }
        System.out.println("End here");



        //multiple catch blocks
        try{
            getInt();
        }catch(NumberFormatException nfe){
            System.out.println("Hey dude you can't");
        } catch(NullPointerException npe){ //catch any type of exception
            //call stack: throw exception goes up to the call stack until is caught by a catch statement
            System.out.println("Hey dude you can't");
        }
        System.out.println("End here");
        //or everything in one catch
        try{
            getInt();
        }catch(NumberFormatException | NullPointerException e) {
            System.out.println("Hey dude you can't");
        }
        System.out.println("End here");

        //finally
        try{
            getInt();
            System.out.println("This will not be executed because before the exception is thrown");
        }catch(NumberFormatException | NullPointerException e) {
            System.out.println("Hey dude you can't");
        }finally{ //code that will be executed whether there is exception or not
            System.out.println("Finally");
        }
        System.out.println("End here");

        try{
            int myInt = Integer.parseInt("1");
            System.out.println("This will  be executed because before the exception isn't thrown");
            return; //finally will be executed with also this in the code
        }catch(NumberFormatException | NullPointerException e) {
            System.out.println("Hey dude you can't");
        }finally{ //code that will be executed whether there is exception or not
            System.out.println("Finally");
        }
        System.out.println("End here");

    */
        System.out.println(printNumber()); //5 - finally code always executes

    }
    private static  void getInt(){
        int myInt = Integer.parseInt("pants");
    }

    private static int printNumber(){
        try{
            return 3;
        } catch(Exception e){
            return 4;
        }finally{
            return 5;
        }
    }
}
