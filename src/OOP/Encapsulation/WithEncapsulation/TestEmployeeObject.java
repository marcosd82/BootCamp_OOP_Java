package OOP.Encapsulation.WithEncapsulation;

public class TestEmployeeObject {

    public static void main (String[] args){
        Employee jane = new Employee();
        jane.setSalary(10000000);
        System.out.println("Jane Salary is: "+jane.getSalary());
        jane.setBonus((10000));
        System.out.println("Jane Bonus is: "+jane.getBonus());
        jane.calculateTotalPay();

    }
}
