package Week10.LectureCode.CustomAnnotationa;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RunImmediatelyNTimes {
    int times() default 1; //default value to the method -> if we don't specify it we will be inforced to pass the param. to our annotation
    //int times();
}
