package com.school;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Attendance System!");

		// Create and set details for students
		Student[] students = new Student[2];
		students[0] = new Student();
		students[0].setDetails(1, "Alice");
		students[1] = new Student();
		students[1].setDetails(2, "Bob");

		// Create and set details for courses
		Course[] courses = new Course[2];
		courses[0] = new Course();
		courses[0].setDetails(101, "Mathematics");
		courses[1] = new Course();
		courses[1].setDetails(102, "Science");

		System.out.println("\nStudent Details:");
		for (Student s : students) {
			s.displayDetails();
			System.out.println();
		}

		System.out.println("Course Details:");
		for (Course c : courses) {
			c.displayDetails();
			System.out.println();
		}
	}
}

