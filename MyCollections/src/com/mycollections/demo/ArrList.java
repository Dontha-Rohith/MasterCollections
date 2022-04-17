package com.mycollections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrList {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(1);
		Collections.sort(list);

		// foreach is a new looping feature introduced in java 8
		list.forEach(a -> {
			System.out.println(a);
		});
	}
}
