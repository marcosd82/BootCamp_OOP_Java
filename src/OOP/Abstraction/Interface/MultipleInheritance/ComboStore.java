package OOP.Abstraction.Interface.MultipleInheritance;

public class ComboStore implements FoodStore,ClothesStore,MedicineStore{


    @Override
    public void sellShoes() {

    }

    @Override
    public void sellShirts() {

    }


    @Override
    public void payCashier() {
       //System.out.println("Diamond problem here with interfaces");
        //ClothesStore.super.payCashier();
    }


    @Override
    public void sellFruits() {

    }

    @Override
    public void sellVegetables() {

    }

    @Override
    public void sellPrescription() {

    }

    @Override
    public void sellVitamins() {

    }
}
