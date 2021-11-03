package OOP.Inheritance.Super;


    class Superclass
    {
        int num = 100;
    }


//Child class or subclass or derived class
class Subclass extends Superclass {
    /* The same variable num is declared in the Subclass
     * which is already present in the Superclass
     */
    int num = 110;


    void printNumber(){
        System.out.println("SubClass variable :"+ num);
        System.out.println("Parent Variable: "+super.num);
    }
    public static void main(String args[]){
        Subclass obj= new Subclass();
        obj.printNumber();
    }
}


