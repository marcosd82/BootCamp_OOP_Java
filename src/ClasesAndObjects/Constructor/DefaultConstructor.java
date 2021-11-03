package ClasesAndObjects.Constructor;

public class DefaultConstructor {

    int a;
    boolean b;
    String myString;


    public static void main(String[] args) {

        // A default constructor is called
        DefaultConstructor obj = new DefaultConstructor();

        System.out.println("Default Value:");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
        System.out.println("myString = " + obj.myString);
    }

}
