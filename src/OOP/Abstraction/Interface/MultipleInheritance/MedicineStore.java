package OOP.Abstraction.Interface.MultipleInheritance;

public interface MedicineStore {

    public void sellPrescription();
    public void sellVitamins();

    default void payCashier(){
        System.out.println("Pay pharmacy Technician");

    }
}
