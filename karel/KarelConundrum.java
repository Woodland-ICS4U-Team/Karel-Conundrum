import becker.robots.*;
import java.util.*;

public class KarelConundrum {
	public static void main(String[] args) {
		Random randx = new Random();
		Random randy = new Random();

		int x = randx.nextInt(250)+1;
		int y = randy.nextInt(250)+1;

		City conundrum = new City(250,250);
		Thing t1 = new Thing(conundrum, x, y);

		AndrewRobot andrew = new AndrewRobot(conundrum, 0, 0, Direction.WEST, 0);
/*
		JacobRobot jacob = new JacobRobot(conundrum, 0, 0, Direction.WEST, 0);
		MatthewRobot matt = new MatthewRobot(conundrum, 0, 0, Direction.WEST, 0);
		AndrewRobot andrew = new AndrewRobot(conundrum, 0, 0, Direction.WEST, 0);
		CalebsRobot caleb = new CalebsRobot(conundrum, 0, 0, Direction.WEST, 0);


		Thread jacobsThread = new Thread() {
		jacob.find();
		};

		Thread mattsThread = new Thread() {
		matt.find();
		};

		Thread andrewsThread = new Thread() {
		andrew.find();
		};

		Thread calebsThread = new Thread() {
		caleb.find();
		};

		jacobsThread.start();
		mattsThread.start();
		andrewsThread.start();
		calebsThread.start();
*/
		andrew.find();
	}
}