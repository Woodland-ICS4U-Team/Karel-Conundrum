public class MattRunnableRobot implements Runnable {
    
    MatthewRobot matt;
    
    public void run() {
        matt.find();
    }
    public MattRunnableRobot(MatthewRobot temp) {
        matt = temp;
    }
}