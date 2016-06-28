package day1.robot;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot PokerFace=new Robot();
		// 5. Set your robot's pen to the down position
PokerFace.penDown();
PokerFace.hide();
		// 3. Set the robot to go at max speed (10)
PokerFace.setSpeed(10);
		// 4. Do the following (steps 6-9) 75 times
for (int i = 1; i > 0; i++) {

			// 7. Change the pen color to random
PokerFace.setPenColor(200,200,200);	
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	PokerFace.move(5*i);
			// 2. Turn the robot 1/3 of 360 degrees to the right
	PokerFace.turn(360/3);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
PokerFace.setPenWidth(i);	
PokerFace.setPenColor(150,150,150);	
// 6. Move the robot 5 times the current line number you are drawing (5*i)
PokerFace.move(5*i);
// 2. Turn the robot 1/3 of 360 degrees to the right
PokerFace.turn(360/3);
// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)

// 9. Set the pen width to i
PokerFace.setPenWidth(i);
PokerFace.setPenColor(100,100,100);	
// 6. Move the robot 5 times the current line number you are drawing (5*i)
PokerFace.move(5*i);
// 2. Turn the robot 1/3 of 360 degrees to the right
PokerFace.turn(360/3);
// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)

// 9. Set the pen width to i
PokerFace.setPenWidth(i);
}
	}
}
