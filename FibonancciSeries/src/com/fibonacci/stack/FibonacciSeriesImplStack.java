package com.fibonacci.stack;
import java.util.Scanner;
import java.util.Stack;

public class FibonacciSeriesImplStack {

	Stack<Integer> stack=new Stack<Integer>();
	private void fibonacciSeries(int num) {
		stack.push(0);
		stack.push(1);
		int i=0;

		while(i<num) {
			int top=stack.pop();
			int prev=stack.pop();
		 /**Addition of top and previous numbers*/
			int sum=top+prev;
			System.out.print(prev+ " ");/*Print Series*/
			stack.push(top);
			stack.push(sum);
			i++;
		}
	}
	public static void main(String[] args) {
		FibonacciSeriesImplStack obj= new FibonacciSeriesImplStack();
		Scanner input = new Scanner(System.in);
		  System.out.println("Enter the number to limit Fibonacci series: ");
		int num = input.nextInt();
		  System.out.println("Fibonacci Series " + num + " Numbers: ");

		  obj.fibonacciSeries(num);

		  input.close();
	}

}
