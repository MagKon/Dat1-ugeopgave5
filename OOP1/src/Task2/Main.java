package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1, 1, 1));
        rooms.add(new Room(2, 2, 2));
        rooms.add(new Room(3, 3, 3));

        Building building = new Building(rooms, 1, 1, true);

        System.out.println(countLampsInBuilding(building));
        boolean isNormal = isNormalBuilding(building);
    }

    public static int countLampsInBuilding(Building building) {
        int lamps = 0;
        for (Room room : building.getRooms()) {
            lamps += room.getNumberOfLamps();
        }
        return lamps;
    }

    public static boolean isNormalBuilding(Building building) {
        if (building.getNumberOfFloors() > building.getRooms().size()) {
            return true;
        }
        else {
            System.out.println("This is an odd building");
             return false;
        }
    }
}
