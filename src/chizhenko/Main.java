package chizhenko;

public class Main {

	public static void main(String[] args) {
		
		int[] myArray = {0,5,2,4,7,1,3,1,9};
		int counter = 0;
		
		for (int i=0;i<myArray.length;i++) {
			counter = (myArray[i] % 2 > 0)?counter = counter + 1:counter+0; 	
		}
		
		System.out.println(counter);
				
		}

	

}
