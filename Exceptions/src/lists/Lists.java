package lists;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {

	public static void main(String[] args) {

		List list = new LinkedList();
		list.add(258);
		list.add(0, "João da Silva");
		list.add(1, "Maria das Rosas ");
		list.add(1, "Marcelo das Flores");

		int qtd = list.size();
		
		System.out.println(list.get(1));
		
		list.remove(1);
		
		System.out.println(list.get(1));
		
		boolean x = list.contains("João da Silva");
		
		System.out.println(x);
		
		x = list.contains("258");
		
		System.out.println(x);
		
		list.clear();
	}
}