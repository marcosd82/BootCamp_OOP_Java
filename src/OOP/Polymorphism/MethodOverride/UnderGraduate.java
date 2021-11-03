package OOP.Polymorphism.MethodOverride;

public class UnderGraduate extends Student{

    private int minimunGrade = 75;

    @Override
    public int calculateGPA() {
        return super.calculateGPA();
    }
}
