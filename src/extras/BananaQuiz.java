//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
	String a =	JOptionPane.showInputDialog("do you like bananna's yes or no?");
		
		//2. if they say no, 
	if(a==("no")) { JOptionPane.showMessageDialog(null, "Your Crazy!"); System.exit(0);}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
	else	if(a==("yes")) { String a2= JOptionPane.showInputDialog(null, "What is your favorite hobby!");
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
	JOptionPane.showMessageDialog(null, "a2is much better with bananas");}
			
		//4. OPTIONAL: if they say something other than â€œyesâ€� or â€œnoâ€�
		//	show a pop up that says â€œYou are bananas!â€�
	
	}

}
