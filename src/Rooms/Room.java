package Rooms;

import People.Person;

public class Room {
	Person occupant;
	int xLoc,yLoc;
	String Ore;
	
	public Room(int x, int y, String Ore)
	{
		xLoc = x;
		yLoc = y;
		this.Ore = Ore;
	}

	/**
	 * Method controls the results when a person enters this room.
	 * @param x the Person entering
	 */
	public void enterRoom(Person x)
	{
		System.out.println("You found " + Ore);
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}

	/**
	 * Removes the player from the room.
	 * @param x
	 */
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
