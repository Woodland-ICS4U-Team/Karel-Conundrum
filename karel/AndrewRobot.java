
import becker.robots.*;
public class andrewRobot extends KarelConundrum {
    public AndrewRobot (City cs, int ss, int as, Direction ds, int bs) {    
        super(cs, ss, as, ds, bs);
    }
    public static boolean find() {
        int cnt = 0;
        Direction d = super.getDirection();
        boolean b = super.canPickThing();
        boolean finish = false;
        int x = 100;
        Thing t1 = new Thing(toronto, 25, 10);
        while (d != Direction.SOUTH) {
            super.turnLeft();
            d = super.getDirection();
            
        }
        cnt++;
        while (!finish) {
            for (int i = x; i > 0 ; i--) {
                super.move();
                b = super.canPickThing();
                if (b == true) {
                    super.pickThing();
                    finish = true;
                    i = 0;
                }
            }
            super.turnLeft();
            cnt++;
            if (cnt == 2) {
                x--;
                cnt = 0;
            }
            
        }
        
        return true;
    }
   
}