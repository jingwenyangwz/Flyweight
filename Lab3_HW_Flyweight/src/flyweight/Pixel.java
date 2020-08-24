package flyweight;
public class Pixel implements Flyweight {
	private int  _row;	
	
	public Pixel(int row ) {
		_row = row;
	}

	public void Report(int color,int col) {
		// TODO Auto-generated method stubs
		System.out.print( "Intrinsic State: Row = " + _row + ", Extrinsic State: Coloumn = " + col + ", Color = "+ color+" ");

	}
	
	
}