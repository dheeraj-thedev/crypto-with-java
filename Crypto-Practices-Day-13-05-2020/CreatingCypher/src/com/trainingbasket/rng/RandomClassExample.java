package com.trainingbasket.rng;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


/**
 * The Logic for 
 * 
// 
//  Three ways to generate Random Numbers 
// 1 [util] Random Class
// 2 [] Math class 
// 3 TheadLocalRandomClass
//
//
 * 
 * @author Dheeraj-PC
 *
 */
public class RandomClassExample {

	Random random = new Random();
	// Random randomSeed = new Random(1000);

	public int getRandomNumber() {
		return random.nextInt();
	}

//	public int getRandomNumberSeed() {
//		return randomSeed.nextInt();
//	}

	public static void main(String[] args) {
		// System.out.println(Math.random());
		for (int i = 0; i < 10; i++) {
			System.out.println("=======================================");
			int randNum = ThreadLocalRandom.current().nextInt();
			double randDoub = ThreadLocalRandom.current().nextDouble();
			boolean randBool = ThreadLocalRandom.current().nextBoolean();

			System.out.println("Integer : " + randNum);
			System.out.println("Double : " + randDoub);
			System.out.println("Boolean : " + randBool);

			
		}
	}

}
