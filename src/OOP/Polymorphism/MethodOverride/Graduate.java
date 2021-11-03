package OOP.Polymorphism.MethodOverride;

public class Graduate extends Student{

    private int minimunGrade = 75;

    @Override
    public int calculateGPA() {

        int sum = 0;

        for (int grade:getGrades()){
            if (grade>=minimunGrade)
                sum+=grade;

        }
        return sum/ getGrades().length;
    }
}
