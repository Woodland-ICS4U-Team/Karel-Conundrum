
import becker.robots.*;
public class andrewRobot extends KarelConundrum {
    private int distFromEdge = 0;

    public boolean andFind() {
        int x = 0;
        int y = 0;
        for (y = 0; y <= 250; y++) {
            for (x = 0; x <= 250; x++) {
                super.move();
            }
            super.turnLeft();
            super.turnLeft();
            super.turnLeft();
            super.move();
            super.turnLeft();
            super.turnLeft();
            super.turnLeft();
        }
    }
    public boolean find() {
        return true;
    }
   
}