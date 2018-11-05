package Inventory;

public class Items {
    static int IronCount;
    static int PlatinumCount;
    static int UraniumCount;


    public static void addItem(String[] Inv, String Item)
    {
        int length = Inv.length;
        if (java.util.Arrays.asList(Inv).indexOf(Item) == -1) {
            Inv[length + 1] = Item;
        }
        if (java.util.Arrays.asList(Inv).indexOf(Item) != -1) {
            addNum(Inv, Item);
        }
    }
    public static void addNum(String[] Inv, String Item)
    {
        int place = java.util.Arrays.asList(Inv).indexOf(Item);
        if(Item.equals("Iron"))
        {
            IronCount++;
        }
        if(Item.equals("Platinum"))
        {
            PlatinumCount++;
        }
        if(Item.equals("Uranium"))
        {
            UraniumCount++;
        }
    }
    public static void showItem(String[] Inv)
    {
        String InvList = "";
        for(int x=0;x<Inv.length; x++)
        {
            if(Inv[x].equals("Iron"))
            {
                InvList += "[" + Inv[x] + "x" +IronCount + "] ";
            }
            if(Inv[x].equals("Platinum"))
            {
                InvList += "[" + Inv[x] + "x" +PlatinumCount + "] ";
            }
            if(Inv[x].equals("Uranium"))
            {
                InvList += "[" + Inv[x] + "x" +UraniumCount + "] ";
            }
            InvList += "[" + Inv[x] + "] ";
        }
        System.out.println(InvList);
    }
}
