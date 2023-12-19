/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		int firstNumber = Integer.parseInt(args[0]);
		int secondNumber = Integer.parseInt(args[1]);
		int thirdNumber = Integer.parseInt(args[2]);
		int sum1 = firstNumber + secondNumber;
		int sum2 = firstNumber + thirdNumber;
		int sum3 = secondNumber + thirdNumber;
		// check if the lengths forms a triangle
		boolean isTriangle = (sum1 > thirdNumber) && (sum2 > secondNumber) && (sum3 > firstNumber);
		System.out.println(firstNumber + ", " + secondNumber + ", " + thirdNumber + ": " + isTriangle);	
	}
}
