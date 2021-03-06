import becker.robots.*;
import java.awt.Color;
/**
 * Write a description of class MatthewRobot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MatthewRobot extends Robot{
    public MatthewRobot(City cm, int sm, int am, Direction dm, int bm) {
        super(cm,sm,am,dm,bm);        
    }
    public void find() {
        int XGrid = 75;
        int YGrid = 75;
               
        if (getDirection() == Direction. NORTH) {
            turnRight();
        } else if (getDirection() == Direction.WEST) {
            turnLeft();
            turnLeft();
        } else if (getDirection() == Direction.SOUTH) {
            turnLeft();
        }
            
        for (int i =0; i<= YGrid; i++) {
            for (int x = 0; x<= XGrid; x++) {
                move();
                canPickThing();
                if (canPickThing() == true) {
                    return;
                }
            }
            turnRight();
            move();
            turnRight();
            for (int y = XGrid; y>= 0; y--) {
                move();
                canPickThing();
                if (canPickThing() == true) {
                    return;
                }
            }
            turnLeft();
            move();
            turnLeft();
        }   
        for (;;) {
            changeColor();
        }
    }
    public void turnRight() {
        for(int i =0; i<=2; i++) {
           turnLeft();
        }
    }       
    public void changeColor() {
        setColor(Color.RED);
        setColor(Color.ORANGE);
        setColor(Color.YELLOW);
        setColor(Color.GREEN);
        setColor(Color.BLUE);
        setColor(Color.BLACK);
        setColor(Color.WHITE);
        setColor(Color.PINK);
    }
}
