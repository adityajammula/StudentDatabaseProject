package com.StudentDatabase;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tutionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student First Name");
		this.firstName = in.nextLine();

		System.out.println("Enter Student last Name ");
		this.lastName = in.nextLine();

		System.out.println("1 - freshmen\n2 -sophmore\n3 -Junior\n4 - Senior\nEnter Student Class Level");
		this.gradeYear = in.nextInt();

		setStudentID();
	}

	public void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}

	public void enroll() {
		do {
			System.out.println("Enroll into Course (Press Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tutionBalance = tutionBalance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", \n Grade Level =" + gradeYear
				+ ", \nStudent  ID=" + studentID + ", \ncourses Enrolled =" + courses + ", \nBalance=" + tutionBalance + "]";
	}

	public void viewBalance() {
		System.out.println("Your Balance is : $" + tutionBalance);
	}

	public void payBalance() {
		viewBalance();
		System.out.println("Enter your Payment $");
		Scanner in = new Scanner(System.in);
			int payment = in.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for your payment " + payment);
		viewBalance();
	}

}
