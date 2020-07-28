package chapter10_exercise;

public class TheCourseClassQuestion9 {
	public static void main(String[] args) {

		Course mathCourse = new Course("Math");
		
		for(int i = 0;i < 3;i++) {
			mathCourse.addStudent("XieJing"+(i+1));
		}
		
		mathCourse.dropStudent("XieJing1");
		
		String[] students = mathCourse.getStudents();
		for(int i = 0;i<students.length;i++) {
			System.out.println(students[i]);
		}
	}
}

class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	private int size = 100;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		if (numberOfStudents == size) {
			String[] newStudents = new String[size * 2];
			for (int i = 0; i < size / 2; i++) {
				newStudents[i] = students[i];
			}
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {

		String[] newStudents = new String[numberOfStudents];

		for (int i = 0; i < numberOfStudents; i++) {
			newStudents[i] = new String();
			newStudents[i] = students[i];
		}

		return newStudents;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {

		int studentIndex = -1;

		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				studentIndex = i;
			}
		}

		if (studentIndex != -1) {
			if (studentIndex != numberOfStudents - 1) {
				for (int i = studentIndex + 1; i < numberOfStudents; i++) {
					students[i - 1] = students[i];
				}
			} else {
				students[studentIndex] = null;
			}
			numberOfStudents--;
		}
	}

	public void clear() {
		for (int i = 0; i < numberOfStudents; i++) {
			students[i] = null;
		}

		numberOfStudents = 0;
	}

}
