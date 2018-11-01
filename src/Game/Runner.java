package Game;

import Ore.IronOre;
import Ore.PlatinumOre;
import Ore.Stone;
import Ore.UraniumOre;

public class Runner {

    public static void main(String[] args) {
        int mapRow = 8;
        int mapCol = 8;

        IronOre Iron = new IronOre("Iron", 30);
        PlatinumOre Platnium = new PlatinumOre("Platinum", 7);
        UraniumOre Uranium = new UraniumOre("Uranium", 3);
        Stone Stone1 = new Stone("Stone", 60);


        String[][] map = new String[mapCol][mapRow];

        for (int i = 0; i<map.length;i++)
        {
            for (int x = 0; x<map[i].length; x++) {
                double chance = Math.random() * 100;
                //System.out.println(chance);

            }
        }

    }
}
