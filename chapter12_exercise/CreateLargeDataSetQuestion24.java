package chapter12_exercise;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateLargeDataSetQuestion24 {
	public static void main(String[] args) throws IOException {

		File salary = new File("C:\\Users\\Administrator\\Desktop\\Salary.txt");

		if (!salary.exists()) {
			salary.createNewFile();
		}
		PrintWriter salaryWriter = new PrintWriter(salary);

		String[] ranks = { "assistant", "associate", "full" };
		int[][] salaryInt = { { 50000, 80000 }, { 60000, 110000 }, { 75000, 130000 } };

		for (int i = 1; i <= 1000; i++) {
			salaryWriter.print("FirstName" + i + " ");
			salaryWriter.print("LastName" + i + " ");
			int random = (int) (Math.random() * 3);
			salaryWriter.print(ranks[random] + " ");
			salaryWriter.printf("%.2f\n",
					salaryInt[random][0] + Math.random() * (salaryInt[random][1] - salaryInt[random][0]));
		}

		salaryWriter.close();
	}
}
