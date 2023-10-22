package n1ex01;

import java.util.ArrayList;


public class N1ex01 {
	public static void main(String[] args) {
		
		ArrayList<String> people = new ArrayList<>();	
		ArrayList<String> results = new ArrayList<>();
		people.add("Javi");
		people.add("Oscar");
		people.add("Carlos");
		people.add("Pepe");	
		
		people.forEach(	(name) -> {if(name.toLowerCase().contains("o")) results.add(name);});
		
		System.out.println(results);
	}

}
