package AccessModifier;

/*When we don't use any keyword explicitly, Java will set a default access to a given class, method or property.
The default access modifier is also called package-private, which means that all members are visible within the same package but aren't accessible from other packages

message methdos is accessible in another class of the same package
 */
public class DefaultAccess {

    void message(){
        System.out.println("This is a message");
    }

}
