package Week10.LectureCode.customannotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

record Lion(String name) {

    @RunImmediately
    public void saySomething(){
        System.out.println("Lion method saySomething");
    }
    public void saySomethingButDontRun(){
        System.out.println("Lion method saySomethingButDontRun");
    }
    @RunImmediatelyNTimes(times = 3)
    public void runMultipleTimes(){
        System.out.println("Multiple times");
    }
}

class Fox{
    private String name;
    private int numOfLegs;

    public Fox(String name, int numOfLegs){
        this.name=name;
        this.numOfLegs=numOfLegs;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public int getNumOfLegs(){
        return numOfLegs;
    }
    public void setNumOfLegs(int numOfLegs){
        this.numOfLegs=numOfLegs;
    }
}

class AnnotationsMain{
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException{
        @SuppressWarnings("unused") //suppress compiler warnings for a particular piece of code or a variable, in this case the "unused" variables
        Lion lion = new Lion("Lav");

        System.out.println(lion.getClass().isAnnotationPresent(VeryImportant.class)); //returns tre if the annot. is present otherwise false
        System.out.println(lion.getClass().isAnnotationPresent(RunImmediately.class));

        for(Method method: lion.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(RunImmediately.class)){ //check whether the annot. runimmediately is present
                System.out.println("Method name is " + method.getName());
                method.invoke(lion);
            } else if(method.isAnnotationPresent(RunImmediatelyNTimes.class)){
                RunImmediatelyNTimes annotation = method.getAnnotation(RunImmediatelyNTimes.class);
                for(int i=0; i<annotation.times(); i++){
                    method.invoke(lion);
                }
            }
        }

        Fox fox = new Fox("Lija", 4);
        for(Field field: fox.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(ImportantString.class)){
                field.setAccessible(true);
                Object value = field.get(fox);
                if(value instanceof String myFoxName) //// String myFoxName = (String) value
                System.out.println(
                        "The field name is " + field.getName()  + " and its values in uppercase is " + myFoxName.toUpperCase()
                );
            }
        }
    }
}
