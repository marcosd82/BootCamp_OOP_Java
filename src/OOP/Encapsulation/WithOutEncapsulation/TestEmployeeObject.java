package OOP.Encapsulation.WithOutEncapsulation;

public class TestEmployeeObject {

    public static void main (String[] args){
        Employee jane = new Employee();
        jane.salary=1000000;
        jane.bonus= 10000;
        jane.calculateTotalPay();

    }
}
