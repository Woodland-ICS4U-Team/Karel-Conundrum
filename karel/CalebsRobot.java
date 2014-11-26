/**
 
 * In this class I am extending the abilities of the Robot class
 * 
 * Caleb Isaacs
 * Nov 24, 2014
 */
import becker.robots.*;
public class CalebsRobot extends Robot 
{
    public CalebsRobot(City cs, int ss, int as, Direction ds, int bs) {
        super(cs, ss, as, ds, bs);
    }
  public boolean find (){
      
      int length = 75;
      
     
     turnLeft();
     turnLeft();
     turnLeft();
   
     for (int i=0; i<= length; i++){
       for (int j=0; j<= length; j++){
         move();
         canPickThing();
         if(canPickThing() == true ) {
             pickThing();
             return true ;
         }
       }
     
     turnLeft();
     turnLeft();
     turnLeft();
     move();
     turnLeft();
     turnLeft();
     turnLeft();
   }
   
   return false;
 }
 
}

