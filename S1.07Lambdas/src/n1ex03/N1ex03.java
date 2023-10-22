package n1ex03;

import java.util.ArrayList;
import java.util.Arrays;

public class N1ex03 {
	public static void main(String[] args) {

		ArrayList<String> months = new ArrayList<String>(Arrays.asList("January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November", "December"));

		months.forEach((m) ->{System.out.println(m);});
	}
}
