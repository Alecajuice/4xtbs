
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

	public Coordinate getUlPosition() {
		return ulPosition;
	}

	public void setUlPosition(Coordinate ulPosition) {
		this.ulPosition = ulPosition;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setHeight(double height) {
		this.height = (int)height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setWidth(double width) {
		this.width = (int)width;
		
	}
}