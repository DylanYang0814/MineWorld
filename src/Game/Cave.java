//Dylan Yang APCSP Period 2-3
package Game;

import Ore.IronOre;
import Ore.PlatinumOre;
import Ore.Stone;
import Ore.UraniumOre;
import Rooms.Room;

public class Cave {

    static Room[][] mineworld = new Room[8][8];

    public static void GenerateCave() {
        IronOre Iron = new IronOre("Iron", 30);
        PlatinumOre Platinum = new PlatinumOre("Platinum", 7);
        UraniumOre Uranium = new UraniumOre("Uranium", 3);

        //Fill the mineworld with random ores
        for (int x = 0; x < mineworld.length; x++) {
            for (int y = 0; y < mineworld[x].length; y++) {
                int chance = (int) (Math.random() * 100);
                if (0 <= chance && chance <= Uranium.getRarity()) {
                    mineworld[x][y] = new Room(x, y, "Uranium", false);
                }
                if (Uranium.getRarity() < chance && chance <= Platinum.getRarity()) {
                    mineworld[x][y] = new Room(x, y, "Platinum",false);
                }
                if (Platinum.getRarity() < chance && chance <= Iron.getRarity()) {
                    mineworld[x][y] = new Room(x, y, "Iron",false);
                }
                if (Iron.getRarity() < chance) {
                    mineworld[x][y] = new Room(x, y, "Stone",false);
                }
            }
        }
    }

    public static String PrintBoard() {
        String out = "";
        for (int i = 0; i < mineworld.length; i++) {
            for (int x = 0; x < mineworld[i].length; x++) {
                out += "[" + mineworld[i][x].toString() + "] ";
            }
            out += "\n";
        }
        return out;
    }

//    public static String toString(Room[][] mineworld, int x, int y) {
//        if (mineworld[x][y].equals("Stone")) {
//            return "Stone";
//        }
//        if (mineworld[x][y].equals("Iron")) {
//            return "Iron";
//        }
//        if (mineworld[x][y].equals("Platinum")) {
//            return "Platinum";
//        }
//        if (mineworld[x][y].equals("Uranium")) {
//            return "Uranium";
//        }
//        return null;
//    }
}

