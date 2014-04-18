/*
 * Camera class: represents the player's view of the map
 */
import java.awt.Point;


public class Camera
{
	
	private Point ulPosition;
	private double zoomRatio;
	
	public Camera()
	{
		zoomRatio = 1;
		ulPosition = new Point(0, 0);
	}
	
	public Camera(Point pos)
	{
		zoomRatio = 1;
		ulPosition = pos;
	}

	public Point getulPosition() {
		return ulPosition;
	}

	public void setulPosition(Point ulPosition) {
		this.ulPosition = ulPosition;
	}

	public double getZoomRatio() {
		return zoomRatio;
	}

	public void setZoomRatio(double d) {
		this.zoomRatio = d;
	}
	
}
