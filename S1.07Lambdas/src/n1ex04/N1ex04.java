package n1ex04;

import java.util.ArrayList;
import java.util.Arrays;

public class N1ex04 {
	public static void main(String[] args) {

		ArrayList<String> months = new ArrayList<String>(Arrays.asList("January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November", "December"));

		months.forEach(System.out::println);
	}
	
}
