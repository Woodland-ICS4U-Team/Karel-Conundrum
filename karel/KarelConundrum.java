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
		jacobsRobot jacob = new Robot(conundrum, 0, 0, Direction.WEST, 0);
		mattsRobot matt = new Robot(conundrum, 0, 0, Direction.WEST, 0);
		andrewsRobot andrew = new Robot(conundrum, 0, 0, Direction.WEST, 0);
		calebsRobot caleb = new Robot(conundrum, 0, 0, Direction.WEST, 0);
*/
/*
		Thread jacobsThread = new Thread() {

		};

		Thread mattsThread = new Thread() {

		};

		Thread andrewsThread = new Thread() {

		};

		Thread calebsThread = new Thread() {

		};

		jacobsThread.start();
		mattsThread.start();
		andrewsThread.start();
		calebsThread.start();
*/
		andrew.Find();
	}
}