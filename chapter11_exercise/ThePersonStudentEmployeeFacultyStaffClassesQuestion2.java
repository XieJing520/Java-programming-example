package chapter11_exercise;

public class ThePersonStudentEmployeeFacultyStaffClassesQuestion2 {
	public static void main(String[] args) {

	}
}

class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String EMailAddress;

	@Override
	public String toString() {
		return "Person" + name;
	}

}

class Student extends Person {
	
}

class Employee extends Person {

}

class Faculty extends Employee {

}

class Staff extends Employee {

}
