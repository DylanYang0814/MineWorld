package Game;

import Inventory.Items;
import People.Person;
import Rooms.Room;
import Rooms.WinningRoom;

import java.util.Scanner;

public class Runner {


    private static boolean gameOn = true;

    public static void main(String[] args) {
        Cave.GenerateCave();
        int x = (int) (Math.random() * Cave.mineworld.length);
        int y = (int) (Math.random() * Cave.mineworld.length);
        while (x == 0 || y == 0) {
            x = (int) (Math.random() * Cave.mineworld.length);
            y = (int) (Math.random() * Cave.mineworld.length);
        }
        Cave.mineworld[x][y] = new WinningRoom(x, y, "Exit", false);
        Person player1 = new Person(0, 0);
        System.out.println("You woke up with a headache, in your hand is a rusty pickaxe \nThe pickaxe has a ancient inscription on it, you begin to mine your way out ");
        Game.Cave.mineworld[0][0].enterRoom(player1);
        Scanner in = new Scanner(System.in);
        while (gameOn) {
            System.out.println("Where would you like to move? (Choose N, S, E, W) or (Craft, Bag, or Map)");
            String move = in.nextLine();
            if (move.equalsIgnoreCase("Bag")) {
                Items.showItem();
            }
            if (move.equalsIgnoreCase("Map")) {
                System.out.println(Cave.PrintBoard());
            }
            if (validMove(move, player1, Cave.mineworld)) {
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
