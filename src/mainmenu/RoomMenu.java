package mainmenu;

import models.Room;
import services.RoomService;

import java.util.Scanner;

public class RoomMenu {
    public static RoomService service = new RoomService();
    public static Scanner scanner = new Scanner(System.in);

    public static int inputRoomNumbersTable() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhap so ban:");
        while (true) {
            number = scanner.nextInt();
            if (number > 0 && number < 100) {
                return number;
            }
        }
    }

    public static void addNewRoom() {
        Scanner scanner = new Scanner(System.in);
        int numberOfTable;
        while (true) {
            try {
                numberOfTable = inputRoomNumbersTable();
                break;
            } catch (Exception e) {
                System.out.println("ban phai nhap so");
                UserMenu.choiceRoomService();
                UserMenu.choiceManagement();
            }
        }
        numberOfTable = inputRoomNumbersTable();
        Room room = new Room(1, "Phong trong", numberOfTable);
        service.add(room);
        service.printList();
        UserMenu.choiceRoomService();
        UserMenu.choiceManagement();
    }
}
