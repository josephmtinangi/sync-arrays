package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Long> existing = new ArrayList<Long>();
		existing.add(new Long(2));
		existing.add(new Long(3));
		existing.add(new Long(4));
		System.out.println("Existing = " + existing);

		List<Long> coming = new ArrayList<Long>();
		coming.add(new Long(2));
		coming.add(new Long(4));
		coming.add(new Long(5));
		System.out.println("Coming = " + coming);

		List<Long> tmpComing = new ArrayList<Long>(coming);

		// Determine new

		System.out.println("New = " + Helper.subtractList(existing, coming));

		// Determine to be removed

		List<Long> joinedList = new ArrayList<Long>(existing);
		joinedList.addAll(coming);

		List<Long> trash = new ArrayList<Long>(Helper.subtractList(tmpComing,
				joinedList));
		System.out.println("Trash = " + trash);

	}

}
