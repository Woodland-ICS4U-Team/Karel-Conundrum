import becker.robots.*;
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
        int XGrid = 100;
        int YGrid = 100;
        turnRight();
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
            for (int y = 100; y>= 0; y--) {
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
    }
    public void turnRight() {
        for(int i =0; i<=2; i++) {
           turnLeft();
        }
    }       
}
