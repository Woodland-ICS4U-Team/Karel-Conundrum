public class CalebRunnableRobot implements Runnable {
    
    CalebsRobot caleb;
    
    public void run() {
        caleb.find();
    }
    public CalebRunnableRobot(CalebsRobot temp) {
        caleb = temp;
    }
}