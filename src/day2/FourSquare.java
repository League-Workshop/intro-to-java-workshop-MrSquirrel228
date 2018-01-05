package day2;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot tim = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		tim.setSpeed(500);
		// 5. Set the pen width to 5
		tim.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...

		// 7. Set the pen color to random

		tim.setRandomPenColor();

		// 1. Call the drawSquare() method
		drawSquare();
		// 8. Turn the robot 90 degrees to the right
		tim.turn(90);
	}

	void drawSquare() {
		// 3. draw a square
		tim.turn(90);

		
	}	


/* 3. Fill in the code to draw a square inside the method below. */

	}
