package OOP.Inheritance;

public class TestInheritance {

    public static void main(String[] args){
        //super class
        Person person= new Person();

        person.setName("Jhon");

        System.out.println("Name person is: " + person.getName());

        //child class
        Student student = new Student();
        student.setName("Peter");

        System.out.println("Name person is: " + student.getName());


        //child class wrapped into supper class
        Person person2= new Student();

        person2.setName("Michel");

        System.out.println("Name person is: " + person2.getName());

    }
}
