
import becker.robots.*;
public class AndrewRobot extends Robot {
    public AndrewRobot (City cs, int ss, int as, Direction ds, int bs) {    
        super(cs, ss, as, ds, bs);
    }
    public boolean find() {
        int cnt = 0;
        Direction d = getDirection();
        boolean b = canPickThing();
        boolean finish = false;
        int x = 100;
        while (d != Direction.SOUTH) {
            turnLeft();
            d = getDirection();
            
        }
        cnt++;
        while (!finish) {
            for (int i = x; i > 0 ; i--) {
                move();
                b = canPickThing();
                if (b == true) {
                    pickThing();
                    finish = true;
                    i = 0;
                }
            }
            turnLeft();
            cnt++;
            if (cnt == 2) {
                x--;
                cnt = 0;
            }
            
        }
        
        return true;
    }
   
}