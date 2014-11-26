public class JacobRunnableRobot implements Runnable {
    
    JacobRobot jacob;
    
    public void run() {
        jacob.find();
    }
    public JacobRunnableRobot(JacobRobot temp) {
        jacob = temp;
    }
}