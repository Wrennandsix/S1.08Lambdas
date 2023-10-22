package n1ex02;

import java.util.ArrayList;


public class N1ex02 {
	public static void main(String[] args) {
		
		ArrayList<String> people = new ArrayList<>();	
		ArrayList<String> results = new ArrayList<>();
		people.add("Javi");
		people.add("Oscar");
		people.add("Carlos");
		people.add("Alexander");	
		
		people.forEach(	(n) -> {if(n.toLowerCase().contains("o") && n.length() > 5) results.add(n);});
		
		System.out.println(results);
	}

}
