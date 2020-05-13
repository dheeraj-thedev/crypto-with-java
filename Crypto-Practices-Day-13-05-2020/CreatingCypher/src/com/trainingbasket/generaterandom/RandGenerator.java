package com.trainingbasket.generaterandom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandGenerator {

	public static void main(String[] args) {

//		Random rand = new Random();
//		System.out.println(rand.nextInt(1000));
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 11; i++) {
			list.add(new Integer(i));
		}
		Collections.shuffle(list);
		for (int i = 0; i < 3; i++) {
			System.out.println(list.get(i));
		}
	}
}
