//Dylan Yang APCSP Period 2-3
package Inventory;

import Game.Runner;

public class Items {

    static String[] Inv = {"Rusty Pickaxe", "Stone", "Iron", "Platinum", "Uranium"};
    static int[] Count = {0, 0, 0, 0, 0};

    /**
     * This method adds the item and detects if you have enough ores to auto win
     * @param Item
     */
    public static void addItem(String Item) {
        int place = java.util.Arrays.asList(Inv).indexOf(Item);
        Count[place]++;

        if (Count[1] >= 15 && Count[2] >= 5 && Count[3] >= 1)
        {
            System.out.println("With the power gathered from the ores you collected, you teleported out.");
            Runner.gameOff();
            //Wins the game if you have enough ores
        }

        if(Item.equalsIgnoreCase("Uranium"))
        {
            System.out.println("The radiation from the uranium killed you ;P");
            Runner.gameOff();
            //Dies if you got uranium
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

    /**
     * This method prints out the items with the number that you have
     */
    public static void showItem() {
        String item = "";
        for (int i = 0; i < Inv.length; i++) {
            item += "[" + Inv[i] + " x" + Count[i] + "]";
        }
        System.out.println(item);
    }

}
