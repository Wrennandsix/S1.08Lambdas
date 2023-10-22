package n1ex08;

import java.util.Scanner;

public class N1ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("Enter a word to turn it upside down");
		input = sc.next();
		
        Reverse reverseFunction = str -> new StringBuilder(str).reverse().toString();
        String reversed = reverseFunction.reverse(input);

        System.out.println("Reversed word: " + reversed);
    }
}
