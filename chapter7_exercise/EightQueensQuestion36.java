package chapter7_exercise;

public class EightQueensQuestion36 {
	public static void main(String[] args) {
		int[] row1 = new int[8];
		int[] row2 = new int[8];
		int[] row3 = new int[8];
		int[] row4 = new int[8];
		int[] row5 = new int[8];
		int[] row6 = new int[8];
		int[] row7 = new int[8];
		int[] row8 = new int[8];

		boolean exitFlag = false;

		for (int r1 = 0; r1 < 8; r1++) {
			for (int r2 = 0; r2 < 8; r2++) {
				for (int r3 = 0; r3 < 8; r3++) {
					for (int r4 = 0; r4 < 8; r4++) {
						for (int r5 = 0; r5 < 8; r5++) {
							for (int r6 = 0; r6 < 8; r6++) {
								for (int r7 = 0; r7 < 8; r7++) {
									for (int r8 = 0; r8 < 8; r8++) {
										if (!isRepeatPoint(r1, r2, r3, r4, r5, r6, r7, r8)) {
											row1[r1] = 1;
											row2[r2] = 1;
											row3[r3] = 1;
											row4[r4] = 1;
											row5[r5] = 1;
											row6[r6] = 1;
											row7[r7] = 1;
											row8[r8] = 1;
											if (isSolutionCorrect(row1, row2, row3, row4, row5, row6, row7, row8)) {
												displaySolution(row1, row2, row3, row4, row5, row6, row7, row8);
												exitFlag = true;
											}
											if(exitFlag)
												break;
											row1[r1] = 0;
											row2[r2] = 0;
											row3[r3] = 0;
											row4[r4] = 0;
											row5[r5] = 0;
											row6[r6] = 0;
											row7[r7] = 0;
											row8[r8] = 0;
										}
									}
									if(exitFlag)
										break;
								}
								if(exitFlag)
									break;
							}
							if(exitFlag)
								break;
						}
						if(exitFlag)
							break;
					}
					if(exitFlag)
						break;
				}
				if(exitFlag)
					break;
			}
			if(exitFlag)
				break;
		}

	}

	public static boolean isSolutionCorrect(int[] r1, int[] r2, int[] r3, int[] r4, int[] r5, int[] r6, int[] r7,
			int[] r8) {
		if (r1[6] + r2[7] > 1)
			return false;
		if (r1[5] + r2[6] + r3[7] > 1)
			return false;
		if (r1[4] + r2[5] + r3[6] + r4[7] > 1)
			return false;
		if (r1[3] + r2[4] + r3[5] + r4[6] + r5[7] > 1)
			return false;
		if (r1[2] + r2[3] + r3[4] + r4[5] + r5[6] + r6[7] > 1)
			return false;
		if (r1[1] + r2[2] + r3[3] + r4[4] + r5[5] + r6[6] + r7[7] > 1)
			return false;
		if (r1[0] + r2[1] + r3[2] + r4[3] + r5[4] + r6[5] + r7[6] + r8[7] > 1)
			return false;
		if (r7[0] + r8[1] > 1)
			return false;
		if (r6[0] + r7[1] + r8[2] > 1)
			return false;
		if (r5[0] + r6[1] + r7[2] + r8[3] > 1)
			return false;
		if (r4[0] + r5[1] + r6[2] + r7[3] + r8[4] > 1)
			return false;
		if (r3[0] + r4[1] + r5[2] + r6[3] + r7[4] + r8[5] > 1)
			return false;
		if (r2[0] + r3[1] + r4[2] + r5[3] + r6[4] + r7[5] + r8[6] > 1)
			return false;

		if (r1[1] + r2[0] > 1)
			return false;
		if (r1[2] + r2[1] + r3[0] > 1)
			return false;
		if (r1[3] + r2[2] + r3[1] + r4[0] > 1)
			return false;
		if (r1[4] + r2[3] + r3[2] + r4[1] + r5[0] > 1)
			return false;
		if (r1[5] + r2[4] + r3[3] + r4[2] + r5[1] + r6[0] > 1)
			return false;
		if (r1[6] + r2[5] + r3[4] + r4[3] + r5[2] + r6[1] + r7[0] > 1)
			return false;
		if (r1[7] + r2[6] + r3[5] + r4[4] + r5[3] + r6[2] + r7[1] + r8[0] > 1)
			return false;
		if (r7[7] + r8[6] > 1)
			return false;
		if (r6[7] + r7[6] + r8[5] > 1)
			return false;
		if (r5[7] + r6[6] + r7[5] + r8[4] > 1)
			return false;
		if (r4[7] + r5[6] + r6[5] + r7[4] + r8[3] > 1)
			return false;
		if (r3[7] + r4[6] + r5[5] + r6[4] + r7[3] + r8[2] > 1)
			return false;
		if (r2[7] + r3[6] + r4[5] + r5[4] + r6[3] + r7[2] + r8[1] > 1)
			return false;

		return true;
	}

	public static void displaySolution(int[]... points) {
		for (int t = 0; t < points.length; t++) {
			for (int e : points[t])
				System.out.printf("|%s", e == 1 ? "Q" : " ");
			System.out.print("|\n");
		}

	}

	public static boolean isRepeatPoint(int... points) {
		for (int i = 0; i < points.length; i++)
			for (int j = i + 1; j < points.length; j++)
				if (points[i] == points[j])
					return true;
		return false;
	}

}
