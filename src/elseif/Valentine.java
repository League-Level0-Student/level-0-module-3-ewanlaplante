package elseif;

import org.jointheleague.graphical.robot.Robot;

public class Valentine {

public static void main(String[] args) {
	Robot bob = new Robot("batman");
	bob.setX(400);
	bob.setY(400);
	bob.penDown();
	bob.sparkle();
	bob.setSpeed(10);
	bob.turn(27);
	bob.move(200);
	bob.setSpeed(10);
	for (int i = 0; i < 160; i++) {
	bob.turn(-1);	
	bob.move(1);
	}
	bob.setX(400);
	bob.setY(400);
	bob.setAngle(0);
	bob.turn(-27);
	bob.move(200);
	bob.setSpeed(10);
	for (int i = 0; i < 160; i++) {
	bob.turn(1);	
	bob.move(1);
	}
	bob.hide();
}






















}
