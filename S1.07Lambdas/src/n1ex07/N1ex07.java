package n1ex07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class N1ex07 {
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

		Collections.sort(list, Comparator.comparing(String::length));
		
		ListIterator<String> it = list.listIterator(list.size());

		while (it.hasPrevious()) {
			Object element = it.previous();
			System.out.println(element);
		}
	}
}

