package day5;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class NAME {
	public static void main(String [] args){
		Robot x = new Robot();
		x.setSpeed(10);
		x.penDown();
		x.hide();
		
		x.setPenWidth(10);
		x.setPenColor(Color.gray);
		
		x.setX(10);
		x.setY(100);
		
		x.turn(90);
		x.move(290);
		
		x.setX(150);
		x.turn(90);
		x.move(360);
		
		x.turn(90);
		x.move(140);
		x.turn(90);
		x.move(120);
		
		x.setX(400);
		x.setY(100);
		
		x.turn(180);
		x.move(360);
		
		x.setX(400);
		x.setY(240);
		
		//x.move(140);
		x.turn(-90);
		x.move(140);
		x.turn(-90);
		x.move(140);
		x.turn(-90);
		x.move(140);
	}
}
