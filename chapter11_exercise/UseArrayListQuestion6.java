package chapter11_exercise;

import java.util.ArrayList;
import java.util.Date;

public class UseArrayListQuestion6 {
	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<Object>();
		Loan loan = new Loan();
		Date date = new Date();
		String string = "I love WangJinHeng";
		Circle circle = new Circle();

		list.add(loan);
		list.add(date);
		list.add(string);
		list.add(circle);

		for (Object object : list) {
			System.out.println(object.toString());
		}

	}
}

class Loan {

}

class Circle {

}
