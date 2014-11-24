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
	}
}