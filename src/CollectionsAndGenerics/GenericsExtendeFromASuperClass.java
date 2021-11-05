package CollectionsAndGenerics;

import OOP.Inheritance.Student;

import java.util.ArrayList;

//the generic class only support child classes from Number such as Integer, Float, Double, etc
class ContainerExtended<T extends Number>{

    T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){

        this.value = value;
    }

    public void demo(ArrayList<Integer> obj){

    }

    public void show(){

        System.out.println(value.getClass().getName());
    }


}

  class GenericsExtended {

    public static void main (String [] args){
        //example with a class Integer, only acept Integer
        //Container <Integer> obj = new Container<>();
        //obj.setValue(9);

        //Example using a custom studen class in order to verify my Container <T generic type>
        ContainerExtended <Integer> obj = new ContainerExtended<>();
        obj.setValue(10);
        obj.show();
        obj.demo(new ArrayList<Integer>());

    }





}
