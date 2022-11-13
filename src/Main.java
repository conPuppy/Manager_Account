import manager.ManagerAccount;
import model.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerAccount managerAccount = new ManagerAccount();
        while (true) {
            System.out.println("Quản lý tài khoản");
            System.out.println("1. Hiển thị tài khoản");
            System.out.println("2. Thêm tài khoản mới");
            System.out.println("3. Sửa password theo username");
            System.out.println("4. Xóa tài khoản theo username");
            System.out.println("5. Tìm tài khoản theo username");
            System.out.println("6. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerAccount.show();
                    break;
                case 2:
                    managerAccount.add(managerAccount.creatAccount());
                    break;
                case 3:
                    System.out.println("Nhập username muốn sửa password: ");
                    String usernameChange = scanner.nextLine();
                    managerAccount.changePassword(usernameChange);
                    break;
                case 4:
                    System.out.println("Nhập username tài khoản bạn muốn xoá: ");
                    String usernameDelete = scanner.nextLine();
                    managerAccount.delete(usernameDelete);
                    break;
                case 5:
                    System.out.println("Nhập username tài khoản bạn muốn tìm kiếm: ");
                    String usernameSearch = scanner.nextLine();
                    managerAccount.search(usernameSearch);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }

        }
    }
}