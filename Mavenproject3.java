/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;


public class Mavenproject3 {

    public static void main(String[] args) {
        int[] n = {6, 10,11,16, 26, 36, 40,20000}; 
        for (int i = 0; i < n.length; i++) {
            
           long startTime = System.nanoTime(); 
           double result = calculateFactorialIterative(n[i]); 
           long endTime = System.nanoTime(); 
            long executionTime = endTime - startTime; 

            System.out.println("Factorial of " + n[i] + " is: " + result);
            System.out.println("Execution time in Iterative: " + executionTime + " nanoseconds");
             startTime = System.nanoTime();
             result = calculateFactorialRecursive(n[i]);
             endTime = System.nanoTime();
             executionTime = endTime - startTime;
            System.out.println("Factorial of " + n[i] + " is: " + result);
            System.out.println("Execution time in Recursive : " + executionTime + " nanoseconds");

            System.out.println();
        }
    }
    public static double calculateFactorialRecursive (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorialRecursive(n - 1);
    }
    public static double calculateFactorialIterative(int n) { 
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        double factorial = 1;
        for (int i = 2; i <= n; i++) { 
            factorial *= i;
        }
        return factorial;
    }
}


