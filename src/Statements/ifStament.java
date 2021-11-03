package Statements;

import java.util.Scanner;

public class ifStament {

        public static void main(String[] args) {

            System.out.println("Enter the number: ");

            // Taking input from the console

            int num;
            Scanner in = new Scanner(System.in);
            num = in.nextInt();

            // conditional check for age criteria
            if(num < 0){
                System.out.println("Negative number");
            }

            else if(num > 0){
                System.out.println("Positive number");
            }

            else{
                System.out.println("Number is zero");
            }

        }


}
