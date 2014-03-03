
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
		if (pos.getX() > ulPosition.getX() && pos.getY() > ulPosition.getY() && pos.getX() < (ulPosition.getX() + width) && pos.getY() < (ulPosition.getY() + height))
		{
			return true;
		}
		return false;
	}
}
