package day1.robot;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
Robot DonaldTrump=new Robot();
DonaldTrump.penDown();
DonaldTrump.setSpeed(5);
DonaldTrump.moveTo((890),(750));
for (int i = 0; i < 4; i++) {
	

	for (int j = 0; j < 10; j++) {
		DonaldTrump.setPenColor(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255));
		DonaldTrump.move(50);
	}
DonaldTrump.turn(90);
}



}}