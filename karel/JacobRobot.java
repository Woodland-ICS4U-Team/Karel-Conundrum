import becker.robots.*;
public class JacobRobot extends Robot {
    private int distFromEdge = 0;
    public JacobRobot (City cs, int ss, int as, Direction ds, int bs) {    
        super(cs, ss, as, ds, bs);
    }
    
    public boolean find() {
        return true;
    }
}