package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	System.out.println("Hello World");
		Robot tim = new Robot();
		tim.penDown();
		tim.move(200);
		tim.setAngle(180);
		
		
	}
}
