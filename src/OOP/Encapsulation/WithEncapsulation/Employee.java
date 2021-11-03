package OOP.Encapsulation.WithEncapsulation;

public class Employee {
    private double salary;
    private double bonus;

    public void calculateTotalPay(){

        double totalPay = getSalary() + getBonus();
        System.out.println("Total Pay= " +totalPay);

    }



    public void setSalary(double salary){

        if (salary >= 50000 && salary <=250000){

            this.salary=salary;

        }else{

            this.salary=0;
            System.out.println("Salary is incorrect");
        }

    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
