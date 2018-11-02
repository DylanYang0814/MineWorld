package Game;

import Ore.IronOre;
import Ore.PlatinumOre;
import Ore.Stone;
import Ore.UraniumOre;
import People.Person;
import Rooms.Room;
import Rooms.WinningRoom;
import Game.Cave;

import java.util.Scanner;

public class Runner {


    private static boolean gameOn = true;

    public static void main(String[] args) {
        Room[][] Mineworld = new Room[8][8];

        IronOre Iron = new IronOre("Iron", 30);
        PlatinumOre Platinum = new PlatinumOre("Platinum", 7);
        UraniumOre Uranium = new UraniumOre("Uranium", 3);
        Stone Stone1 = new Stone("Stone", 60);

        //Fill the Mineworld with normal rooms
        for (int x = 0; x < Mineworld.length; x++) {
            for (int y = 0; y < Mineworld[x].length; y++) {
                //Mineworld[x][y] = new Room(x,y);
                int chance = (int) (Math.random() * 100);
                //System.out.println(chance);
                if (0 <= chance && chance <= Uranium.getRarity()) {
                    // System.out.println("Uranium");
                    Mineworld[x][y] = new Room(x, y, "Uranium");
                }
                if (Uranium.getRarity() < chance && chance <= Platinum.getRarity()) {
                    //System.out.println("Platinum");
                    Mineworld[x][y] = new Room(x, y, "Platinum");
                }
                if (Platinum.getRarity() < chance && chance <= Iron.getRarity()) {
                    // System.out.println("Iron");
                    Mineworld[x][y] = new Room(x, y, "Iron");
                }
                if (Iron.getRarity() < chance) {
                    //System.out.println("Stone");
                    Mineworld[x][y] = new Room(x, y, "Stone");
                }

            }
        }

        //Create a random winning room.
        int x = (int) (Math.random() * Mineworld.length);
        int y = (int) (Math.random() * Mineworld.length);
        Mineworld[x][y] = new WinningRoom(x, y, "The Exit");

        //Setup player 1 and the input scanner
        Person player1 = new Person("FirstName", "FamilyName", 0, 0);
        Mineworld[0][0].enterRoom(player1);
        Scanner in = new Scanner(System.in);
        while (gameOn) {
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if (validMove(move, player1, Mineworld)) {
                System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());

            } else {
                System.out.println("Please choose a valid move.");
            }


        }
        in.close();
    }

    /**
     * Checks that the movement chosen is within the valid game map.
     *
     * @param move the move chosen
     * @param p    person moving
     * @param map  the 2D array of rooms
     * @return
     */
    public static boolean validMove(String move, Person p, Room[][] map) {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0) {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc() - 1][p.getyLoc()].enterRoom(p);
                    return true;
                } else {
                    return false;
                }
            case "e":
                if (p.getyLoc() < map[p.getyLoc()].length - 1) {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
                    return true;
                } else {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1) {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc() + 1][p.getyLoc()].enterRoom(p);
                    return true;
                } else {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0) {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc() - 1].enterRoom(p);
                    return true;
                } else {
                    return false;
                }
            default:
                break;

        }
        return true;
    }

    public static void gameOff() {
        gameOn = false;
    }


}
