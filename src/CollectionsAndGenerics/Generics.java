package CollectionsAndGenerics;

import OOP.Inheritance.Student;

import java.util.ArrayList;

class Container<T>{

    T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){

        this.value = value;
    }

    public void show(){

        System.out.println(value.getClass().getName());
    }


}

public class Generics {

    public static void main (String [] args){
        //example with a class Integer, only acept Integer
        //Container <Integer> obj = new Container<>();
        //obj.setValue(9);

        //Example using a custom studen class in order to verify my Container <T generic type>
        Container <Student> obj = new Container<>();
        obj.setValue(new Student());
        obj.show();

    }





}
