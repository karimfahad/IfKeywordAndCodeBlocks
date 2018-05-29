package com.IfKeywordAndCodeBlocks;

public class Main {

	public static void main(String[] args) {
		int firstNumber = 4000;
		int levelCompleted = 5;
		boolean gameOber = true;
		int bonus = 100;
		int score = 1000;
		int levelCompleted2 = 8;
		int bonus2 = 200;
		
		
		if(firstNumber == 4000){
			System.out.println("this is 4000");
		} else if (firstNumber == 3000) {
			System.out.println("this is 3000");
		} else {
			System.out.println("exit out");
		}
		
		if (gameOber == true) { //variable inside a code block cannot be used outside the code block
			int finalScore = firstNumber + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		} //variable outside code block can be used anywhere
		
		if (gameOber == true) { //variable inside a code block cannot be used outside the code block
			int finalScore = firstNumber + (levelCompleted2 * bonus2);
			System.out.println("Your final score was " + finalScore);
		} //variable outside code block can be used anywhere
		

	}

}
