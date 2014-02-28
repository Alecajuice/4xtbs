
public class Camera
{
	
	private Coordinate position;
	private double zoomRatio;
	
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

	public double getZoomRatio() {
		return zoomRatio;
	}

	public void setZoomRatio(double d) {
		this.zoomRatio = d;
	}
	
}
