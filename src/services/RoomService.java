package services;

import models.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService implements Management<Room>{

    static List<Room> roomList= new ArrayList<>();

    static {
        Room room1 = new Room(1, "Phong trong", 50);
        Room room2 = new Room(2, "Phong trong", 65);
        Room room3 = new Room(3, "Da su dung", 70);
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
    }

    @Override
    public Room findById(long id) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomNumber() == id) {
                return roomList.get(i);
            }
        }
        return null;
    }
    @Override
    public void printList() {
        System.out.printf("%-16s%-26s%-26s%n", "Room Number:", "Status:", "Number Of Table ");
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println(roomList.get(i));
        }
    }
    @Override
    public void updateById(long id, Room room) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomNumber() == id) {
                roomList.get(i).setStatus(room.getStatus());
                break;
            }
        }
    }

    @Override
    public void add(Room room) {
        room.setRoomNumber(roomList.size() + 1);
        roomList.add(room);
    }

    @Override
    public void delete(long id) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomNumber() == id) {
                roomList.remove(i);
                return;
            }
        }
    }

}
