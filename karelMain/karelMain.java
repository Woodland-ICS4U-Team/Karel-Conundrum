
/**
Created by Jacob Brunsting
October 2014
 */
import java.util.*;
import becker.robots.*;
public class karelMain {
    public static void main() {
        while (loop == true) {
            City toronto = new City(30, 30);
            Robot karel = new Robot(toronto, 0, 0, Direction.EAST, 3);
    }
    
    //A function to simplify print statements
    public static void println(String text) {
        System.out.println(text);
    }
    
    //A function to simplify print statements
    public static void print(String text) {
        System.out.print(text);
    }
    
    public static void turnTo(Robot karel, Direction direction) {
        while (karel.getDirection() != direction) {
            karel.turnLeft();
        }
    }
}
