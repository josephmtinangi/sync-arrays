package main;

import java.util.ArrayList;
import java.util.List;

public class Helper {

	public static List<Long> subtractList(List<Long> listA, List<Long> listB) {

		listB.removeAll(listA);

		List<Long> newList = new ArrayList<Long>(listB);

		return newList;
	}
}
