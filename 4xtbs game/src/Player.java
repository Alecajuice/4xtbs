import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class Player 
{
	//Constructer instance variables
	Stack<Unit> unitList = new Stack<Unit>();
	Stack<City> cityList = new Stack<City>();
	Stack<Notification> notify = new Stack<Notification>();
	
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

