package ClasesAndObjects.Constructor;

public class NonParametrizeConstructor {

    int i;

    // constructor with no parameter
    private NonParametrizeConstructor() {
        i = 5;
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {

        // calling the constructor without any parameter
        NonParametrizeConstructor obj = new NonParametrizeConstructor();
        System.out.println("Value of i: " + obj.i);
    }
}
