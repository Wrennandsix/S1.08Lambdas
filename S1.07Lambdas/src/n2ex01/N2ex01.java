package n2ex01;

import java.util.ArrayList;

public class N2ex01 {

	public static void main(String[] args) {
		ArrayList<String> people = new ArrayList<>();	
		ArrayList<String> results = new ArrayList<>();
		people.add("Javi");
		people.add("Amy");
		people.add("Amelin");
		people.add("Oscar");
		people.add("Carlos");
		people.add("Pepe");	
		
		people.forEach(	(name) -> {if(name.charAt(0) == 'A' && name.length() == 3) results.add(name);});
		
		System.out.println(results);
	}

}

