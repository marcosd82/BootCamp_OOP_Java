package OOP.Inheritance.Super;


    class SuperClassTwo
    {
        int num = 100;

        //Overridden method
        public void display(){
            System.out.println("Display number from Parent Class: "+num);
        }

    }

    class SubclassTwo extends SuperClassTwo {
        /* The same variable num is declared in the Subclass
         * which is already present in the Superclass
         */
        int num = 110;

        //Overriding method of Parent class
        public  void display(){
            System.out.println("Display number from Child Class: "+num);
        }

        public void printMsg(){
            //This would call Overriding method
            display();
            //This would call Overridden method
            super.display();
        }


        public static void main(String args[]){
            SubclassTwo obj= new SubclassTwo();
            obj.printMsg();
        }
    }


