import becker.robots.*;
import java.util.*;

public class KarelConundrum {
	public void main() {
		Random randx = new Random();
		Random randy = new Random();
		String jacobsName = "jacobs";

		int x = randx.nextInt(75)+1;
		int y = randy.nextInt(75)+1;

		City conundrum = new City(75,75);
		Thing t1 = new Thing(conundrum, x, y);

		JacobRobot jacob = new JacobRobot(conundrum, 0, 0, Direction.WEST, 0);
		MatthewRobot matt = new MatthewRobot(conundrum, 0, 0, Direction.WEST, 0);
		AndrewRobot andrew = new AndrewRobot(conundrum, 0, 0, Direction.WEST, 0);
		//CalebsRobot caleb = new CalebsRobot(conundrum, 0, 0, Direction.WEST, 0);
		
		jacob.find();
		andrew.find();
		matt.find();
		
		//Thread jacobsThread = new Thread(this, jacobsName);
		//jacobsThread.start();
		//mattsThread.start();
		//andrewsThread.start();
		//calebsThread.start();
	}
	//public void jacobs(){ jacob.find(); }
	//public void andrews(){ andrew.find(); }
	//public void calebs(){ caleb.find(); }
	//public void matt){ matt.find(); }
}