package Inventory;

import Game.Runner;
import Rooms.Room;
import Rooms.WinningRoom;

public class Items {

    static String[] Inv = {"Rusty Pickaxe", "Stone", "Iron", "Platinum", "Uranium"};
    static int[] Count = {0, 0, 0, 0, 0};

    public static void addItem(String Item) {
        int place = java.util.Arrays.asList(Inv).indexOf(Item);
        Count[place]++;

        if (Count[2] >= 8 && Count[3] >= 5 && Count[3] >= 1)
        {
            System.out.println("With the power gathered from the ores you collected, you teleported out.");
            Runner.gameOff();
        }

        if(Item.equalsIgnoreCase("Uranium"))
        {
            System.out.println("The radiation from the uranium killed you ;P");
            Runner.gameOff();
        }
//
//
////        int length = Inv.length;
////        if (java.util.Arrays.asList(Inv).indexOf(Item) == -1) {
////            Inv = new String[5];
//////            Inv[length + 1] = Item;
////            int empty = 0;
////            for (int i=0;i< Inv.length;i++) {
////                if (Inv[i] == null) {
////                    empty = i;
////                    Inv[i] = Item;
////                    break;
////                }
////            }
////        }
////        if (java.util.Arrays.asList(Inv).indexOf(Item) != -1) {
////            addNum(Item);
////        }
    }
//
//    public static void addNum(String Item) {
//        if (Item.equalsIgnoreCase("Iron")) {
//            IronCount++;
//        }
//        if (Item.equalsIgnoreCase("Platinum")) {
//            PlatinumCount++;
//        }
//        if (Item.equalsIgnoreCase("Uranium")) {
//            UraniumCount++;
//        }
//    }

    public static void showItem() {
        String item = "";
        for (int i = 0; i < Inv.length; i++) {
            item += "[" + Inv[i] + " x" + Count[i] + "]";
        }
        System.out.println(item);
    }

}
