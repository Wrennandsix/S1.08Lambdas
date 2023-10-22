package n1ex06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class N1ex06 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Pepe");
		list.add("5");
		list.add("7");
		list.add("4");
		list.add("6");
		list.add("Hola");
		list.add("Astronauta");
		list.add("Arboleda");
		list.add("Mundo");

		Collections.sort(list, Comparator.comparing(name -> {
			if (name instanceof String) {
				return ((String) name).length();
			}
			return 0;
		}));
		list.forEach((name) -> {System.out.println(name);});

	}
}

