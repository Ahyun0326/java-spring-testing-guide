package com.example.sample;

import java.util.Scanner;

public class CalculatorRequestReader {

  public CalculatorRequest read() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers and an operator (e.g 1 + 2): ");
    String result = sc.nextLine();
    String[] parts = result.split(" ");
    return new CalculatorRequest(parts);
  }

}
