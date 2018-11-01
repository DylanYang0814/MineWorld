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
                int chance = (int)(Math.random() * 100);
                //System.out.println(chance);
                if (0 <= chance && chance <= Uranium.getRarity())
                {
                    System.out.println("Uranium");
                }
                if (Uranium.getRarity() <= chance && chance <= Platnium.getRarity())
                {
                    System.out.println("Platinum");
                }
                if (Platnium.getRarity() <= chance && chance <= Iron.getRarity())
                {
                    System.out.println("Iron");
                }
                if (Iron.getRarity() <= chance && chance >= Stone1.getRarity())
                {
                    System.out.println("Stone");
                }

            }
        }

    }
}
