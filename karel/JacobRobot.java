import becker.robots.*;
public class JacobRobot extends Robot {
    private int distFromEdge = 1;
    private int citySize = 75;
    public JacobRobot (City cs, int ss, int as, Direction ds, int bs) {    
        super(cs, ss, as, ds, bs);
    }
    
    public boolean find() {
        return search();
    }
    
    public boolean find(int temp) {
        citySize = temp;
        return search();
    }
    
    private boolean search() {
        //Turn in the correct starting direction to spiral
        while (super.getDirection() != Direction.SOUTH) {
            super.turnLeft();
        }
        
        //While it has not found the thing, keep searching
        while (!super.canPickThing()) {
            //if it has reached the edge of the search area
            if (shouldTurn()) {
                super.turnLeft();
                //Decreace the serch area after it has completed a circle around the outside of the area
                if (super.getDirection() == Direction.WEST) {
                    distFromEdge ++;
                }
            } else {
                super.move();
            }
        }
        return true;
    }
    
    //Turn if the robot is at the edge of the search area
    public boolean shouldTurn() {
        if ((super.getDirection() == Direction.NORTH) && (super.getStreet() <= distFromEdge)) {
            return true;
        }
        if ((super.getDirection() == Direction.EAST) && (super.getAvenue() >= citySize - distFromEdge)) {
            return true;
        }
        if ((super.getDirection() == Direction.SOUTH) && (super.getStreet() >= citySize - distFromEdge)) {
            return true;
        }
        if ((super.getDirection() == Direction.WEST) && (super.getAvenue() <= distFromEdge)) {
            return true;
        }
        return false;
    }
}