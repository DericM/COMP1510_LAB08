package q4;

public class DrunkenWalk {
	public static void main (String[] args){
		RandomWalk test1;
		int steps = 600;
		int boundry = 10;
		int falls = 0;
		
		test1 = new RandomWalk(steps,boundry);
		for(int i = steps;i > 0;i--){
			test1.takeStep();
			
			if(test1.moreSteps() && !test1.inBounds()){
				falls++;
				test1 = new RandomWalk(i,boundry);
				
			}

		}
		System.out.println("Falls:" + falls);
		
	}
}
