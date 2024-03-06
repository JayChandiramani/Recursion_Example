package com.jetbrain;
import java.util.Scanner;

public class Main {
    static int N;
    static int Ans;

    public static int Factorial(int N){
        if (N == 0)
            return 1;
        else{
            Ans = N * Factorial(N-1);
            return Ans;
        }
    }

    public static void main(String[] args) {
	Scanner Input = new Scanner(System.in);

	System.out.println("Please enter the number you would like to find the factorial of.");
	System.out.print("Number: ");
	N = Input.nextInt();
	System.out.println(N + "! = " + Factorial(N));
    }
}
