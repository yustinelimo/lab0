
package main;

import Operations.Arithmetic;
import Operations.calculator;

import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int f,s;
System.out.println("input f number:");
f = scanner.nextInt();
System.out.println("input s number:");
s = scanner.nextInt();

Arithmetic arithmetic = new Arithmetic(f, s);

calculator Calculator = new calculator();
int result = Calculator.difference();
    }
    
}