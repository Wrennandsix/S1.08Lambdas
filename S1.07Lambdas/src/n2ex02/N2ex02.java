package n2ex02;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class N2ex02 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(4);
		nums.add(2);
		nums.add(3);
		nums.add(5);

		String result = oddEvenSorter(nums);
		System.out.println(result);
	}

	public static String oddEvenSorter(ArrayList<Integer> nums) {
		return nums.stream().map(numero -> (numero % 2 == 0 ? "e" : "o") + numero).collect(Collectors.joining(", "));
	}
}
