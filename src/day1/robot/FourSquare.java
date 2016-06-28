package day1.robot;

import java.util.Random;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot Lelele=new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
Lelele.setSpeed(10);
Lelele.penDown();
Lelele.hide();
		// 5. Set the pen width to 5
Lelele.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
for (int i = 0; i < 4; i++) {
	

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
    Lelele.turn(90);
	}
	}
	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		for (int i = 0; i < 4; i++) {
			

			for (int j = 0; j < 10; j++) {
				Lelele.setRandomPenColor();
				Lelele.move(10);
			}
		Lelele.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
