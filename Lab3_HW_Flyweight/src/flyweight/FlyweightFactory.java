package flyweight;
import java.util.ArrayList;



public class FlyweightFactory {

	private static ArrayList<Pixel> pixelMap = new ArrayList<Pixel>();
	
	public static Flyweight getFlyweight(int row) {
		Pixel pixel = null;
		try {
			pixel = pixelMap.get(row);
			}
			catch(Exception e) {}
		
		if (pixel == null) {
			pixel = new Pixel(row);
			pixelMap.add(pixel);
			System.out.println("accessing row: " + row );
			System.out.println("creating pixel of row: " + row +" ");
		}
		return pixel;
	}
}
