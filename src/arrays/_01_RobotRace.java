package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		int start = 100;

		// 2. create an array of 5 robots.
		Robot robot[] = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robot.length; i++) {
			robot[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		robot[0].setX(100);
		robot[0].setY(550);
		robot[1].setX(250);
		robot[1].setY(550);
		robot[2].setX(400);
		robot[2].setY(550);
		robot[3].setX(550);
		robot[3].setY(550);
		robot[4].setX(700);
		robot[4].setY(550);

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random rad = new Random();
		for (int p = 0; p < 200000; p++) {

			for (int i = 0; i < robot.length; i++) {
				int num = rad.nextInt(50);
				robot[i].setSpeed(7);
				robot[i].move(num);
				if (robot[i].getY() < 0) {
					JOptionPane.showMessageDialog(null, i + "  won");
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}