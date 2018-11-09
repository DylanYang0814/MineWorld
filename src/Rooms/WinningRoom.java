package Rooms;

import Game.Runner;
import People.Person;

public class WinningRoom extends Room {

    public WinningRoom(int x, int y, String Ore, boolean hasExplored) {
        super(x, y, Ore, hasExplored);

    }

    /**
     * Triggers the game ending conditions.
     *
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the exit and left with expensive ores in your hand.");
        Runner.gameOff();
    }

    public void enoughMaterial(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("With the power gathered from the ores you collected, you teleported out.");
        Runner.gameOff();
    }


}
