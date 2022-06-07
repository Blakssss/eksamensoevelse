package HusEksamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class House {
    ArrayList<Room> rooms = new ArrayList<>();
    Random random = new Random();

    public void makeRooms(){
        rooms.add(new Room(random.nextInt(10,100),random.nextInt(10,100)));
        rooms.add(new Room(random.nextInt(10,100),random.nextInt(10,100)));
        rooms.add(new Room(random.nextInt(10,100),random.nextInt(10,100)));
        rooms.add(new Room(random.nextInt(10,100),random.nextInt(10,100)));
        rooms.add(new Room(random.nextInt(10,100),random.nextInt(10,100)));
    }

    public static void main(String[] args){
        House house = new House();
        house.makeRooms();
        Collections.sort(house.rooms);
        System.out.println(house.rooms);
    }
}
