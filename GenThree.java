/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int min = Integer.parseInt(args[0]); //minimal boundry
		int max = Integer.parseInt(args[1]) - 1; // maximal boundry
		int firstNumber = (int)(Math.random() * (max - min + 1) + min);
		int secondNumber = (int)(Math.random() * (max - min + 1) + min);
		int thirdNumber = (int)(Math.random() * (max - min + 1) + min);
		int minimum = Math.min(firstNumber, secondNumber); // calculates the lowest number that was generated
		minimum = Math.min(minimum, thirdNumber);
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
		System.out.println("The minimal generated number was " + minimum);	
	}
}
