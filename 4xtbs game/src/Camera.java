
public class Camera
{
	
	private Coordinate ulPosition;
	private double zoomRatio;
	
	public Camera()
	{
		zoomRatio = 1;
		ulPosition = new Coordinate(0, 0);
	}
	
	public Camera(Coordinate pos)
	{
		zoomRatio = 1;
		ulPosition = pos;
	}

	public Coordinate getulPosition() {
		return ulPosition;
	}

	public void setulPosition(Coordinate ulPosition) {
		this.ulPosition = ulPosition;
	}

	public double getZoomRatio() {
		return zoomRatio;
	}

	public void setZoomRatio(double d) {
		this.zoomRatio = d;
	}
	
}
