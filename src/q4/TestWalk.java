package q4;

//************************************************************
//TestWalk.java
//
//Program to test methods in the RandomWalk class.
//************************************************************
import java.util.Scanner;
public class TestWalk{
	public static void main (String[] args){
		int maxSteps; // maximum number of steps in a walk
		int maxCoord; // the maximum x and y coordinate
		int x, y; // starting x and y coordinates for a walk
		
		RandomWalk test1;
		RandomWalk test2;
		RandomWalk test3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println ("\nRandom Walk Test Program");
		System.out.println ();
		System.out.print ("Enter the boundary for the square: ");
		maxCoord = scan.nextInt();
		System.out.print ("Enter the maximum number of steps: ");
		maxSteps = scan.nextInt();
		System.out.print ("Enter the starting x and y coordinates with " +
		"a space between: ");
		
		x = scan.nextInt();
		y = scan.nextInt();
		test1 = new RandomWalk(10,5);
        test2 = new RandomWalk(maxSteps,maxCoord);
		
		for(int i = 0;i < 500;i++){
		
    		test1.takeStep();
    		test2.takeStep();
    		
    		System.out.println (test1);
    		System.out.println (test1.getMaxDistance());
    		System.out.println (test2);
    		System.out.println (test2.getMaxDistance());
		}
		
		
		test3 = new RandomWalk(200,10);
		test3.walk();
		System.out.println(test3);
		
	}
}