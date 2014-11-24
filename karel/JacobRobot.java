import becker.robots.*;
public class JacobRobot extends Robot {
    private int distFromEdge = 0;
    private int citySize = 250;
    public JacobRobot (City cs, int ss, int as, Direction ds, int bs) {    
        super(cs, ss, as, ds, bs);
    }
    
    public boolean find() {
        while (super.getDirection() != Direction.EAST) {
            super.turnLeft();
        }
        while (!super.canPickThing()) {
            super.move();
        }
        return true;
    }
}