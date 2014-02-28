import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class Player 
{
	//Constructor instance variables
	private Stack<Unit> unitList = new Stack<Unit>();
	private Stack<City> cityList = new Stack<City>();
	private Stack<Notification> notify = new Stack<Notification>();
	private Camera camera = new Camera();
	
	//Player constructor
	public Player()
	{
		
	}
	
	public void addNotify(String text)
	{
		Notification current = new Notification();
		current.setText(text);
		notify.push(current);
	}
	
	public void notifyPlayer()
	{
		while(true)
		{
			try
			{
				System.out.println(notify.pop().getText());
				//TODO: Somehow notify the player
			}
			catch (EmptyStackException e)
			{
				
			}
		}
	}

	public Stack<Unit> getUnitList() {
		return unitList;
	}

	public void setUnitList(Stack<Unit> unitList) {
		this.unitList = unitList;
	}

	public Stack<City> getCityList() {
		return cityList;
	}

	public void setCityList(Stack<City> cityList) {
		this.cityList = cityList;
	}

	public Stack<Notification> getNotify() {
		return notify;
	}

	public void setNotify(Stack<Notification> notify) {
		this.notify = notify;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}
}

