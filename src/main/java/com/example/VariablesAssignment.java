package com.example;

public class VariablesAssignment {

    // TODO: Declare and initialize a byte variable with any value between 1 and 127
    byte byteVariable = 42;

    //TODO: Declare and initialize a short variable with any value between 1 and 32767
    short shortVariable = 1000;

    // TODO: Declare and initialize an int variable with any positive value
    int intVariable = 45;

    // TODO: Declare and initialize a long variable with any positive value
    long longVariable = 78890L;

    // TODO: Declare and initialize a float variable with any positive value
    float floatVariable = 89.87f;

    // TODO: Declare and initialize a double variable with any positive value
    double doubleVariable = 89.87d;

    // TODO: Declare and initialize a char variable with the initial of your first name
    char charVariable = 'G';

    // TODO: Declare and initialize a boolean variable(true/false) with the value true or false
    boolean booleanVariable = true;

    // TODO: Create a method that accepts two integers as parameters and returns their sum
    public int sum(int a, int b) {
        return a+b; // Change this line to return the actual sum
    }

    // TODO: Create a method that accepts two double parameters and returns their product
    public double product(double a, double b) {
        return a*b; // Change this line to return the actual product
    }

    public String reverseString(String str) {
        // Create a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();
    
        // Iterate through the characters of the input string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
    
        // Convert the StringBuilder to a String and return it
        return reversed.toString();
    }
    
}
