//Dylan Yang APCSP Period 2-3
package Ore;

public class UraniumOre implements Ore {

    private String type;
    private int rarity;

    public UraniumOre(String type, int rarity) {
        this.type = type;
        this.rarity = rarity;
    }

    public String getType() {
        return type;
    }

    public int getRarity() {
        return rarity;
    }

    public String toString()
    {
        return "Uranium";
    }
}
