package array;

public class NestedLoop {

	public static void main(String[] args) {
		// create a nested loop
		// while loop 3 times
		// for 4
		// do while 5 
		// it would iterate for 60 times
		
		
		int i = 0;
		int count = 0;
	
		
		while (i<3) {
			for (int j = 0; j<4; j++) {
				
				int k = 0;
				do {
					System.out.println("i->"+i+"j->"+j+"k->"+ k);
					k++;
					count++;
				} while (k<5);
		}
		i++;
		}
		System.out.println("the itereation count is " + count);
		
		

	}

}
