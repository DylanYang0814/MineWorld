//Dylan Yang APCSP Period 2-3
package Rooms;

import Inventory.Items;
import People.Person;

public class Room {
    Person occupant;
    int xLoc, yLoc;
    String Ore;
    boolean hasExplored = false;

    public Room(int x, int y, String Ore, boolean hasExplored) {
        xLoc = x;
        yLoc = y;
        this.Ore = Ore;
        this.hasExplored = hasExplored;
    }

    /**
     * Method controls the results when a person enters this room.
     *
     * @param x the Person entering
     */
    public void enterRoom(Person x) {
        System.out.println("You found " + Ore);
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        Items.addItem(Ore);
        hasExplored = true;
    }


    /**
     * Removes the player from the room.
     *
     * @param x
     */
    public void leaveRoom(Person x) {
        occupant = null;
    }

    public String toString()
    {
        if (hasExplored) {
            return Ore;
        }
        if (!hasExplored)
        {
            return " ";
        }
        return "";
    }

}
