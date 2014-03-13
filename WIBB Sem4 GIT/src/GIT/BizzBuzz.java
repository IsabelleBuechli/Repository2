package GIT;


public class BizzBuzz {

		
		public BizzBuzz(int max) {
			for (int i = 1; i <=max; i++){
				String output = "";
				boolean replaced= false;
				if (i%3==0){
					output = output+"Bizz";
					replaced = true;
				}
				if (i%5==0){
					output = output+"Buzz";
					replaced = true;
				}
				if (replaced){
					System.out.print(output+" ");
				} else {
					System.out.print(i+" ");
				}
			}
		}

		
		public static void main(String[] args) {
			int max = 100;
			BizzBuzz bb = new BizzBuzz(max);
		}

	}

	
	
