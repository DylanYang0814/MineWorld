package Game;

import Ore.IronOre;
import Ore.PlatinumOre;
import Ore.Stone;
import Ore.UraniumOre;
import Rooms.Room;

public class Cave {

    public static void GenerateCave(Room[][] Mineworld) {
        IronOre Iron = new IronOre("Iron", 30);
        PlatinumOre Platinum = new PlatinumOre("Platinum", 7);
        UraniumOre Uranium = new UraniumOre("Uranium", 3);
        Stone Stone1 = new Stone("Stone", 60);

        //Fill the Mineworld with random ores
        for (int x = 0; x < Mineworld.length; x++) {
            for (int y = 0; y < Mineworld[x].length; y++) {
                int chance = (int) (Math.random() * 100);
                if (0 <= chance && chance <= Uranium.getRarity()) {
                    Mineworld[x][y] = new Room(x, y, "Uranium");
                }
                if (Uranium.getRarity() < chance && chance <= Platinum.getRarity()) {
                    Mineworld[x][y] = new Room(x, y, "Platinum");
                }
                if (Platinum.getRarity() < chance && chance <= Iron.getRarity()) {
                    Mineworld[x][y] = new Room(x, y, "Iron");
                }
                if (Iron.getRarity() < chance) {
                    Mineworld[x][y] = new Room(x, y, "Stone");
                }
            }
        }
    }
}
