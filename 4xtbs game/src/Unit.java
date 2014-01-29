
public class Unit
{
	//Unit types
	public final int TYPE_MELEE = 1;
	public final int TYPE_RANGED = 2;
	public final int TYPE_FAST = 3;
	public final int TYPE_FASTRANGED = 4;
	public final int TYPE_BOAT = 5;
	private Coordinate position;
	private int type;
	public Unit(int x, int y, int type, int level) {
		position = new Coordinate(x, y);
	}
}
