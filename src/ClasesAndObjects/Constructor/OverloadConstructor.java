package ClasesAndObjects.Constructor;

public class OverloadConstructor {

    String language;

    // constructor with no parameter
    OverloadConstructor() {
        this.language = "Java";
    }

    // constructor with a single parameter
    OverloadConstructor(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("Programming Langauage: " + this.language);
    }

    public static void main(String[] args) {

        // call constructor with no parameter
        OverloadConstructor obj1 = new OverloadConstructor();

        // call constructor with a single parameter
        OverloadConstructor obj2 = new OverloadConstructor("Python");

        obj1.getName();
        obj2.getName();
    }


}
