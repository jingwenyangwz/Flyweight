package flyweight;
import java.util.Random;



public class FlyweightDemo {
	public static final int ROWS = 6, COLS = 10;
	//private static final String colors[] = 
	  //    { "Red", "Green", "Blue", "White", "Black" };
	
	public static void main( String[] args ) {
		

		int[][] matrix = new int [ROWS][COLS];

		Random rand = new Random();
		for (int i=0; i < ROWS; i++) {
			for (int j=0; j < COLS; j++) {	
				matrix[i][j] = rand.nextInt()%128+128;
			}
		}
	
		for (int i=0; i < ROWS; i++) {
			for (int j=0; j < COLS; j++)
				{
				Flyweight pixel = FlyweightFactory.getFlyweight(i);
				pixel.Report(matrix[i][j], j);
				System.out.println();
				}  		 
				  
	}

}
	
}