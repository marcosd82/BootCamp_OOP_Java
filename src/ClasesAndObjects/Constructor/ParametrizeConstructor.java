package ClasesAndObjects.Constructor;

public class ParametrizeConstructor {

    String languages;

    // constructor accepting single value
    ParametrizeConstructor(String lang) {
        ////super();
        languages = lang;
        System.out.println(languages + " Programming Language");
    }

    public static void main(String[] args) {

        // call constructor by passing a single value
        ParametrizeConstructor obj1 = new ParametrizeConstructor("Java");
        ParametrizeConstructor obj2 = new ParametrizeConstructor("Python");
        ParametrizeConstructor obj3 = new ParametrizeConstructor("C");
    }

}
