/*
1. Create a custom access control mechanism for a messaging system where users can send messages to each other.
The goal is to implement this control through a set of custom annotations.

- The first annotation, @CanSendMessage, should be applied to *methods* that grant users the ability to send messages.
- The second annotation, @RequiresPermission, is intended for use on *classes* or *methods* and specifies the necessary permission level a user must possess to send messages.
- Lastly, the @UserPermission annotation is designed to be applied to the User and Admin class, allowing the definition of specific permission levels for admins.
- The user class has an attribute username and represents users in the messaging system.
- The Admin class has also attribute username and represents admin in the messaging system.
- The MessagingSystem class demonstrates the usage of the custom annotations.
        - You should implement a sendMessage method that prints which user sent a message if the user is admin, and if it is a regular user then it should print a message that the user is restricted.
        - You should also apply the already created custom annotations to it.
    - In the main method inside the MessagingSystem class, demonstrate the usage of the sendMessage method by creating instances of users with different permission levels.
    - Print the results to showcase how the implemented annotations enforce or allow message sending based on the specified permission levels.
*/

package Week10.LabCode.Exercise1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target(ElementType.METHOD) //should be applied to *methods*
@Retention(RetentionPolicy.RUNTIME)
@interface CanSendMessage { //public @interface
}

@Target({ElementType.METHOD, ElementType.TYPE}) //intended for use on classes or methods
@Retention(RetentionPolicy.RUNTIME)
@interface RequirePermission { //public @interface
    //PermissionLevel value();
    boolean permissionLevel() default true;
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface UserPermission { //public @interface
    //PermissionLevel value();

    boolean permissionLevel() default true;
}

/*
enum PermissionLevel {
    USER,
    ADMIN
}
*/

//@UserPermission(PermissionLevel.USER) //ovdje se onda samo stavlja permissionLevel = false jer je user
@UserPermission(permissionLevel=false)
class User{
    String username;

    public User(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }
}

//@UserPermission(PermissionLevel.ADMIN)
@UserPermission
class Admin{
    String username;
    public Admin(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }
}

class Messaging {

    @CanSendMessage
    //@RequirePermission(PermissionLevel.ADMIN)
    /*
    public static void sendMessage(Admin admin, String message){
        System.out.println("Admin " + admin.username + " sent a message " + message);
    }
     */
    /*or*/
    @RequirePermission
    public static void sendMessage(Admin admin, String message) {
        if (admin.getClass().isAnnotationPresent(UserPermission.class)) {
            UserPermission permission = admin.getClass().getAnnotation(UserPermission.class);
            if (permission.permissionLevel()) {
                System.out.println("Admin: " + message);
            } else {
                System.out.println("User is not allowed");
            }
        }
    }
    /*
    @CanSendMessage
    @RequirePermission(PermissionLevel.USER)
    public static void sendMessage(User user, String message){
        System.out.println("User " + user.username + " is restricted from sending a message.");
    }
    */
}

class MessagingSystem{
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
/*
        // Admin user
        Admin adminUser = new Admin("adminUser");
        sendMessage(adminUser, "Hello Admin!");

        // Regular user
        User regularUser = new User("regularUser");
        sendMessage(regularUser, "Hello User!");

 */
        Admin admin = new Admin("admin");
        User user = new User("user");

        Messaging messaging = new Messaging();
        for(Method method: messaging.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(CanSendMessage.class)) {
                method.invoke(messaging, admin, "admin messaging");
                method.invoke(messaging, user, "user messaging");
            }
        }
    }
}