
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "december 21st";
		String dadsBirthday = "april 6th";
		String myBirthday = "August 22nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String day = JOptionPane.showInputDialog("Who's birthday do you want to know, mom's, dad's or mine?");
		// 3. Print out what the user typed
		System.out.print(day);
		// 4. if user asked for "mom"
		if(day.equals("mom's")){
			//print mom's birthday
		System.out.println(momsBirthday);}
		// 5. if user asked for "dad"
			else if(day.equals("dad's")) {
			// print dad's birthday
			System.out.println(dadsBirthday);} else if(day.equals("mine")) {{
		// 6. if user asked for your name
				
				
			// print myBirthday
				System.out.println(myBirthday);}}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			else { System.out.println("I don't remember that birthday`"); System.exit(0);}
	} 
}
