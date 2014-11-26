
import becker.robots.*;
import java.awt.Color;
public class AndrewRobot extends Robot {
    
    public int x = 74;
    public AndrewRobot (City cs, int ss, int as, Direction ds, int bs) {    
        super(cs, ss, as, ds, bs);
    }
    
    public boolean find() {
        return search();
    }
    public boolean find(int size) {
        x = size;
        return search();
    }
    public boolean search() {
        int cnt = 0;
        Direction d = getDirection();
        boolean b = canPickThing();
        boolean finish = false;
        
        setColor(Color.BLUE);
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
                    setColor(Color.GREEN);
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