package day3;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String [] args){
		Robot r2d2 = new Robot();
		Robot r2d3 = new Robot();
		r2d3.moveTo(100,300);
		r2d2.penDown();
		r2d3.penDown();
		r2d2.setSpeed(10);
		r2d3.setSpeed(10);
		r2d2.setPenColor(255, 0, 0);
		r2d3.setPenColor(Color.black);
		for(int i = 0; i<6; i++){
			r2d2.move(100);
			r2d2.turn(60);
			r2d2.move(100);
		}
		
		for(int i = 0; i<8; i++){
			r2d3.move(100);
			r2d3.turn(45);
			r2d3.move(100);
		}
		
	}
}
