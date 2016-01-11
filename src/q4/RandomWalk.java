package q4;

import java.util.Random;

public class RandomWalk {
	private int x,y,maximum,stepsTaken,boundry,maxDistance;
	
	RandomWalk (int max, int edge){
		maximum = max;
		boundry = edge;
		x = y = stepsTaken = maxDistance =0;
	}
	RandomWalk (int max, int edge, int startX, int startY){
		maximum = max;
		boundry = edge;
		x = startX;
		y = startY;
		stepsTaken = maxDistance = 0;
	}
	
	public static boolean samePosition (RandomWalk p1, RandomWalk p2){
		if(p1.getX()==p2.getX() && p1.getY()==p2.getY()){
			return true;
			
		}else {
			return false;
		}
	}
	
	public void walk(){
	    while(moreSteps() && inBounds()){
	        takeStep();
	    }
	}
	
	public void takeStep(){
	    Random rand = new Random();
	    int r = rand.nextInt(4);
	    switch(r){
	        case 0:
	            x++;
	            stepsTaken++;
	            break;
	        case 1:
	            x--;
                stepsTaken++;
                break;
	        case 2:
	            y++;
                stepsTaken++;
                break;
	        case 3:
	            y--;
                stepsTaken++;
                break;
	    }
	    maxDistance = max(max(Math.abs(x),Math.abs(y)),maxDistance);
	}
	
	public void reboundStep(){
	    takeStep();
	    if(!inBounds()){
	        
	    }
	}
	
	private int max(int num1, int num2){
		return (num1 > num2)? num1:num2;
	}
	
	public boolean moreSteps(){
	    return stepsTaken < maximum;
	}
	
	public boolean inBounds(){
	    return Math.abs(x) < boundry && Math.abs(y) < boundry;
	}
	
	public String toString(){
		return "Steps:" + stepsTaken + " Position:(" + x + "," + y + ")";
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getMaxDistance(){
		return maxDistance;
	}
	
}
