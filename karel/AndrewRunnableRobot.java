public class AndrewRunnableRobot implements Runnable {
    
    AndrewRobot andrew;
    
    public void run() {
        andrew.find();
    }
    public AndrewRunnableRobot(AndrewRobot temp) {
        andrew = temp;
    }
}