package n2ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class N2ex04 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Pepe");
		list.add("5");
		list.add("Eustaquio");
		list.add("8");
		list.add("4");
		list.add("3");
		list.add("entrecot");
		list.add("Carol");

		list.sort((string1, string2) -> Integer.compare(string1.charAt(0), string2.charAt(0)));
		System.out.println(list);

		list.sort((string1, string2) -> {
			boolean startsWithE1 = string1.regionMatches(true, 0, "e", 0, 1);
			boolean startsWithE2 = string2.regionMatches(true, 0, "e", 0, 1);
			if (startsWithE1 && !startsWithE2) {
				return -1;
			} else if (!startsWithE1 && startsWithE2) {
				return 1;
			}
			return 0;
		});
		System.out.println(list);

		list.replaceAll(string -> string.replace("a", "4"));

		System.out.println(list);

		List<String> nums = list.stream().filter(string -> string.chars().allMatch(Character::isDigit))
				.collect(Collectors.toList());
		System.out.println(nums);

	}

}
