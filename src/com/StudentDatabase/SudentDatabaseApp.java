package com.StudentDatabase;

import java.util.Scanner;

public class SudentDatabaseApp {

	public static void main(String[] args) {

		System.out.println("Enter number of new Students to enroll: ");

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Student[] students = new Student[num];
		for (int i = 0; i < num; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payBalance();
			students[i].toString();
		}

		System.out.println(students[0].toString());
		System.out.println(students[1].toString());
		System.out.println(students[2].toString());
	}

}
