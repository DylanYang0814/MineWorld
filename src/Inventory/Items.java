package Inventory;

import Rooms.Room;

public class Items {
    static int IronCount;
    static int PlatinumCount;
    static int UraniumCount;


    public static void addItem(String[] Inv, String Item) {
        int length = Inv.length;
        if (java.util.Arrays.asList(Inv).indexOf(Item) == -1) {
            Inv[length + 1] = Item;
        }
        if (java.util.Arrays.asList(Inv).indexOf(Item) != -1) {
            addNum(Item);
        }
    }

    public static void addNum(String Item) {
        if (Item.equalsIgnoreCase("Iron")) {
            IronCount++;
        }
        if (Item.equalsIgnoreCase("Platinum")) {
            PlatinumCount++;
        }
        if (Item.equalsIgnoreCase("Uranium")) {
            UraniumCount++;
        }
    }

    public static void showItem(String[] Inv) {
        String InvList = "";
        for (int x = 0; x < Inv.length; x++) {
            if (Inv[x].equalsIgnoreCase("Iron")) {
                InvList += "[" + Inv[x] + "x" + IronCount + "] ";
            }
            if (Inv[x].equalsIgnoreCase("Platinum")) {
                InvList += "[" + Inv[x] + "x" + PlatinumCount + "] ";
            }
            if (Inv[x].equalsIgnoreCase("Uranium")) {
                InvList += "[" + Inv[x] + "x" + UraniumCount + "] ";
            }
            if (!Inv[x].equalsIgnoreCase("Uranium") && !Inv[x].equalsIgnoreCase("Iron") && !Inv[x].equalsIgnoreCase("Platinum")) {
                InvList += "[" + Inv[x] + "] ";
            }
        }
        System.out.println(InvList);
    }
    public static String toString(Room Map[][], int x, int y)
    {
        String out = "";
        out += Map[x][y];
        return out;
    }
}
