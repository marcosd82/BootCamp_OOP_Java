package OOP.Polymorphism.MethodOverride;

public class Student extends Person {

    private int studentID;
    private String className;
    private int[] grades;

    public int calculateGPA(){
        int sum=0;
        for (int grade: getGrades()){
            sum = sum+grade;
        }
        return sum/ getGrades().length;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}
