//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		
		// 11. do the following 10 times
		for (int i = 0; i < 12; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String num = JOptionPane.showInputDialog("from a whole number between 1 and 100, pick a number.");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
	int number	=	Integer.parseInt(num);
			// 5. if the guess is correct
			if(number==random) {	
			// 6. win
			System.out.print("you win!");
			System.exit(0);}
			// 7. if the guess is high
				if(number > random) {
				// 8. tell them it's too high
				System.out.print("Its to high!");}
			// 9. if the guess is low
				if(number < random) {
				// 10. tell them it's too low
					System.out.print("Its to low!");}
		// 12. tell them they lose
	if(i==11) {
		System.out.print("You suck!");
		System.exit(0);}}
	}}
		





