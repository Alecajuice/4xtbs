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
}

