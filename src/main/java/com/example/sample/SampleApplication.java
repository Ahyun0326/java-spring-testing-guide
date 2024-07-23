package com.example.sample;

public class SampleApplication {
    public static void main(String[] args) {
      CalculatorRequest calculatorRequest = new CalculatorRequestReader().read();
      long answer = new Calculator().calculate(calculatorRequest.getNum1(),
          calculatorRequest.getOperator(),
          calculatorRequest.getNum2());
      System.out.println(answer);
    }
}
