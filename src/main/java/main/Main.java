package main;

import adapter.PushPopAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> cities = new ArrayList<String>(){{
			add("Minsk");
			add("Grodno");
			add("Brest");
			add("Gomel");
			add("Mogilev");
			add("Vitebsk");
		}};

		PushPopAdapter listAdaptor = new PushPopAdapter(cities);
		System.out.println("Last index in list is now:" + listAdaptor.push(" Borisov"));
		System.out.println("There is no " + listAdaptor.pop() + " in list now");
		System.out.println("There is no " + listAdaptor.pop() + " in list as well");
		System.out.println("The list contains now:");

		System.out.println(listAdaptor.getList());
	}
}
