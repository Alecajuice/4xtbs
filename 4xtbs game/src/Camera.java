
public class Camera
{
	
	private Coordinate position;
	private int zoomRatio;
	
	public Camera()
	{
		zoomRatio = 1;
		position = new Coordinate(0, 0);
	}
	
	public Camera(Coordinate pos)
	{
		zoomRatio = 1;
		position = pos;
	}

	public Coordinate getPosition() {
		return position;
	}

	public void setPosition(Coordinate position) {
		this.position = position;
	}

	public int getZoomRatio() {
		return zoomRatio;
	}

	public void setZoomRatio(int zoomRatio) {
		this.zoomRatio = zoomRatio;
	}
	
}
