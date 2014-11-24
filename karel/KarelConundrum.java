import becker.robots.*;
import java.util.*;

public class KarelConundrum {
	public static void main(String[] args) {
		Random randx = new Random();
		Random randy = new Random();

		int x = randx.nextInt(250)+1;
		int y = randy.nextInt(250)+1;

		City Conundrum = new City(250,250);
		Thing t1 = new Thing(Conundrum, x, y);
/*
		jacobsRobot jacob = new Robot(toronto, 0, 0, Direction.WEST, 0);
		mattsRobot matt = new Robot(toronto, 0, 0, Direction.WEST, 0);
		andrewsRobot andrew = new Robot(toronto, 0, 0, Direction.WEST, 0);
		calebsRobot caleb = new Robot(toronto, 0, 0, Direction.WEST, 0);
*/

		Thread jacobsThread = new Thread() {

		};

		Thread mattsThread = new Thread() {

		};

		Thread andrewsThread = new Thread() {

		};

		Thread calebsThread = new Thread() {

		};
	}
}