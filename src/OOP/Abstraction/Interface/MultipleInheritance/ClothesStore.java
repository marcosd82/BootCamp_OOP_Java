package OOP.Abstraction.Interface.MultipleInheritance;

public interface ClothesStore {

    public void sellShoes();
    public void sellShirts();

    default void payCashier(){
        System.out.println("Pay Cashier");

    }

}
