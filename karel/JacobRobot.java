import becker.robots.*;
public class JacobRobot extends KarelConundrum {
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
            if (shouldTurn()) {
                super.turnLeft();
                if (super.getDirection() == Direction.SOUTH) {
                    distFromEdge ++;
                }
            } else {
                super.move();
            }
        }
        return true;
    }
    
    public boolean shouldTurn() {
        if ((super.getDirection() == Direction.NORTH) || (super.getStreet() >= citySize - distFromEdge)) {
            return true;
        }
        if ((super.getDirection() == Direction.NORTH) || (super.getStreet() >= citySize - distFromEdge)) {
            return true;
        }
        if ((super.getDirection() == Direction.NORTH) || (super.getStreet() >= citySize - distFromEdge)) {
            return true;
        }
        if ((super.getDirection() == Direction.NORTH) || (super.getStreet() >= citySize - distFromEdge)) {
            return true;
        }
        return false;
    }
}