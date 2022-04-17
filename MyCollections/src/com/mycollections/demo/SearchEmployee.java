package com.mycollections.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mycollections.dto.Employee;

public class SearchEmployee {

	public static void main(String args[]) {
		Employee emp = new Employee(1, "aaa", "m", "12345");
		Employee emp1 = new Employee(2, "bbb", "m", "12345");
		Employee emp2 = new Employee(3, "ccc", "m", "12345");
		Employee emp3 = new Employee(4, "ddd", "m", "12345");
		Employee emp4 = new Employee(5, "eee", "m", "12345");
		Employee emp5 = new Employee(6, "fff", "m", "12345");

		int count = 0;
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		for (;;) {
			System.out.println("Search with Employee Id : ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for (int c = 0; c < list.size(); c++) {
				if (list.get(c).getEmpId() == n) {
					System.out.println(list.get(c));
					count++;
				}
			}
			if (count == 0) {
				System.out.println("Employee not found");
			}
			count = 0;
		}
	}

}
