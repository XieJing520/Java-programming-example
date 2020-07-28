package chapter13_exercise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class ShuffleArrayListQuestion2 {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Number>();
		
		list.add(89);
		list.add(520.1314);
		list.add(new BigInteger("5243041"));
		list.add(new BigDecimal("4314237482319470.19856253527"));
		
		
		for(Number e:list) {
			System.out.println(e);
		}
		
		shuffle(list);
		System.out.println();
		for(Number e:list) {
			System.out.println(e);
		}
		
	}
	public static void shuffle(ArrayList<Number> list) {
		
		Number numberPoint = null;
		
		for(int i = 0;i < list.size();i++) {
			int randomIndex = (int)(Math.random() * list.size());
			numberPoint = list.get(randomIndex);
			list.set(randomIndex, list.get(i));
			list.set(i, numberPoint);
		}
	}

}
