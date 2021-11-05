package AccessModifier;

/*If we declare a method, property or constructor with the protected keyword,
we can access the member from the same package (as with package-private access level) and in addition from all subclasses of its class, even if they lie in other packages:*/

class Animal {
    // protected method
    protected void display() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {

        // create an object of Dog class
        Dog dog = new Dog();
        // access protected method
        dog.display();
    }
}
