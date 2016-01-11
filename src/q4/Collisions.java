package q4;

public class Collisions {
	public static void main (String[] args){
		RandomWalk test1;
		RandomWalk test2;
		int steps = 100_000;
		int boundry = 2_000_000;
		int collisions = 0;
		
		test1 = new RandomWalk(steps,boundry,-3,0);
		test2 = new RandomWalk(steps,boundry,3,0);
		
		for(int i = steps;i > 0;i--){
			test1.takeStep();
			test2.takeStep();
			
			if(RandomWalk.samePosition(test1,test2)){
				collisions++;
				
			}else if(!test1.inBounds() || !test2.inBounds()){
				break;
			}
			

		}
		System.out.println("collisions:" + collisions);
		
	}
	
	
	
	
	
}
