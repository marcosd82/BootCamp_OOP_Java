package OOP.Polymorphism.MethodOverload;

public class Overload {


    public static void add (int num1,int num2){
        System.out.println("Add 2 int numbers = "+(num1+num2));
    }

    public static void add (int num1,double num2){
        System.out.println("Add int & double numbers = "+(num1+num2));
    }

    public static void add (double num1,int num2){
        System.out.println("Add double &  int numbers = "+(num1+num2));
    }

    public static void add (double num1,int num2,int numb3){
        System.out.println("Add double &  2 int numbers = "+(num1+num2+numb3));
    }


    public static int add (int num1,int num2,int num3){
        int sum = num1+num2+num3;
        System.out.println("Add 3 int numbers = "+(sum));
        return sum;
    }

}
