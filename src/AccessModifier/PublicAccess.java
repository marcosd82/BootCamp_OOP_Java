package AccessModifier;

/*If we add the public keyword to a class, method or property then we're making it available to the whole world
all other classes in all packages will be able to use it. This is the least restrictive access modifier:

class and methods  for instance is full available to anyone.
 */
public class PublicAccess {

    public void message(){
        System.out.println("This is a message");
    }

}
