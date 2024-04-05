package mainmenu;

import models.User;
import services.UserService;

import java.util.Scanner;

public class UserMenu {
    public static UserService userService = new UserService();

    public static Scanner scanner = new Scanner(System.in);

    public static void login() {
        while (true) {
            System.out.println("Ten dang nhap:");
            String username = scanner.nextLine();
            System.out.println("Mat khau:");
            String password = scanner.nextLine();
            boolean check = userService.checkLogin(username, password);
            if (check) {
                System.out.println("Dang nhap thanh cong");
                System.out.println("Hello: " + UserService.user.getUserName());
                try {
                    choiceRoomService();
                    choiceManagement();
                    break;
                } catch (Exception e) {
                    choiceRoomService();
                    choiceManagement();
                }
            } else {
                System.out.println("Ten dang nhap hoac mat khau khong dung");
            }
        }
    }

    public static void choiceRoomService() {
        System.out.println("Lua chon");
        System.out.println("1. Quan ly phong");
        System.out.println("2. Quan ly user");
        System.out.println("3. Quay lai dang nhap");
        System.out.println("4. Quay lai dang ky");
    }

    public static void choiceManagement() {
        Scanner scanner1 = new Scanner(System.in);
        int choice = scanner1.nextInt();
        switch (choice) {
            case 1: {
                RoomMenu.addNewRoom();
                break;
            }
            case 2: {

                break;
            }
            case 3: {
                UserMenu.login();
            }
            case 4: {
                UserMenu.register();
            }
            case 0: {
                System.exit(0);
            }
            default: {
                System.out.println("Erro");
            }
        }
    }

    public static void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ten dang nhap:");
        String username = scanner.nextLine();
        System.out.println("Mat khau:");
        String password = scanner.nextLine();
        User user = new User(username, password);
        userService.add(user);
        userService.printList();
    }
}
