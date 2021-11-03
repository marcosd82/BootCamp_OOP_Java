package OOP.Polymorphism.MethodOverride;

public class TestOverride {

    public static void main(String [] args){

        int [] grades ={95,100,95,74,89,90};

        Student jane = new Graduate();
        jane.setGrades(grades);

        Student jhon = new UnderGraduate();
        jhon.setGrades(grades);

        System.out.println("Jane's Graduate GPA:"+jane.calculateGPA());
        System.out.println("Jhon´s UnderGraduate GPA: "+ jhon.calculateGPA());


    }
}
