//Dylan Yang APCSP Period 2-3
package Ore;

public class Stone implements Ore {
    private String type;
    private int rarity;

    public Stone(String type, int rarity) {
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
        return "Stone";
    }
}
