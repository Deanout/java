/**
 * This is the package for this program, or the folder that it lives in.
 */
package com.deanin;
/**
 * This is the main class of this program. Our code starts here.
 * @author Dean
 */
public class Program {
    /**
     * This is our main method, the entry point of our program.
     * @param args This is an array of strings passed in from the command line
     *              passed in by the user.
     */
    public static void main(String[] args) {
        boolean doILikePizza = true;
        byte blocks = 120;
        short aSmallerNumber = 7056;
        int myNumber = 42;
        long biggerNumber = 3000;
        float thisIsMyFloat = 3.14f;
        double reallyREALLYbignumber = 3000000.00000;
        
        char myInitial = 'D';
        String initialPlug = "Hello World!";
        
        int a = 10;
        int b = 400;
        
        /* Math operations follow PEMDAS
        * Parentheses
        * Exponents
        * Multiplication
        * Division
        * Addition
        * Subtraction
        * IF TWO THINGS ARE THE SAME LEVEL IN PEMDAS, OPERATIONS
        * HAPPEN LEFT TO RIGHT
        */
        double result = Math.pow(a, b);
        System.out.print("result = ");
        System.out.println(result);
        
        
    }
    /**
     * This is the code covered in episode 1 wrapped into a method.
     */
    private void episode1() {
        int subscriberCount = 3999;
        String initialPlug = "Don't forget to subscribe because I'm at ";
        String finalPlug = " subscribers and your sub counts!";
        String shamelessPlug = initialPlug + subscriberCount + finalPlug;
        System.out.println(shamelessPlug);
    }
}
