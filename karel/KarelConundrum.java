import becker.robots.*;
import java.util.*;

public class KarelConundrum {
	public static void main() {
		Random randx = new Random();
		Random randy = new Random();

		int x = randx.nextInt(75)+1;
		int y = randy.nextInt(75)+1;

		City conundrum = new City(75,75);
		Thing t1 = new Thing(conundrum, x, y);

		JacobRobot jacob = new JacobRobot(conundrum, 0, 0, Direction.WEST, 0);
		MatthewRobot matt = new MatthewRobot(conundrum, 0, 0, Direction.WEST, 0);
		AndrewRobot andrew = new AndrewRobot(conundrum, 0, 0, Direction.WEST, 0);
		//CalebsRobot caleb = new CalebsRobot(conundrum, 0, 0, Direction.WEST, 0);
		
		(new Thread(new AndrewRunnableRobot(andrew))).start();
		(new Thread(new MattRunnableRobot(matt))).start();
		(new Thread(new JacobRunnableRobot(jacob))).start();

	}
}