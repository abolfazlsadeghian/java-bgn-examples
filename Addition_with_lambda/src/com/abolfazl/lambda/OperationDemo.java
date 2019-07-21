package com.abolfazl.lambda;

public class OperationDemo {
    public static void main(String[] args) {
        Addition addition = new Addition();
        float result = addition.execute(2,5);
        System.out.println("Result is : "+ result);

        Subtraction subtract = new Subtraction();
        float resultOne = subtract.execute(2,5);
        System.out.println("Result is : "+ resultOne);

//Using the lambda, the Addition class is not longer needed
// and the method call can be replaced
        Operation addition2 = (a,b)-> a*b;
        float resultTwo = addition2.execute(2,5);
        System.out.println("Result is : "+ resultTwo);
    }
}
