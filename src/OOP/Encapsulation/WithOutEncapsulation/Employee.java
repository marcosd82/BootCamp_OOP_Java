package OOP.Encapsulation.WithOutEncapsulation;

public class Employee {
    double salary;
    double bonus;

    public void calculateTotalPay(){

        double totalPay = salary + bonus;
        System.out.println("Total Pay= " +totalPay);

    }
}
