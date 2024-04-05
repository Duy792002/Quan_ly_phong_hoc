package mainmenu;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Dang nhap");
            System.out.println("2. Dang ky");
            System.out.println("0. Thoat chuonng trinh");
            switch (scanner.nextInt()) {
                case 1: {
                    UserMenu.login();
                    break;
                }
                case 2: {
                    UserMenu.register();
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Moi nhap lai");
                }
            }
        }
    }
}
