
public class ClickBox {

	private Coordinate ulPosition;
	private int height;
	private int width;
	
	public ClickBox(Coordinate pos, int hei, int wid)
	{
		ulPosition = pos;
		height = hei;
		width = wid;
	}
	
	public boolean includes(Coordinate pos)
	{
		return false;
		
	}
}
