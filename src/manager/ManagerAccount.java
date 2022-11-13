package manager;

import model.Account;

import java.util.Scanner;

public class ManagerAccount {
    Account[] accounts = new Account[0];
    Scanner scanner = new Scanner(System.in);

    public void show() {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].toString());
        }
    }

    public Account creatAccount() {
        System.out.println("Tạo id tài khoản:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Tạo tên đăng nhập:");
        String username = scanner.nextLine();
        System.out.println("Tạo password cho tài khoản: ");
        String password = scanner.nextLine();
        System.out.println("Nhập số điện thoại cho tài khoản: ");
        String phone = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        String birthday = scanner.nextLine();
        Account account = new Account(id, username, password, phone, birthday);
        return account;
    }

    public void add(Account account) {
        Account[] newAccount = new Account[accounts.length + 1];
        for (int i = 0; i < accounts.length; i++) {
            newAccount[i] = accounts[i];
        }
        newAccount[newAccount.length - 1] = account;
        accounts = newAccount;
    }

    public int checkUsername(String name) {
        for (int i = 0; i < accounts.length; i++) {
            if (name.equals(accounts[i].getUsername())) {
                return i;
            }
        }
        return -1;
    }

    public void changePassword(String username) {
        int index = checkUsername(username);
        if (index != -1) {
            System.out.println("Nhập password mới: ");
            accounts[index].setPassword(scanner.nextLine());
        } else {
            System.out.println("Không thấy username, hãy nhập lại: ");
            String username2 = scanner.nextLine();
            changePassword(username2);
        }
    }
    public void delete(String username) {
        int index = checkUsername(username);
        if (index != -1) {
            Account[] accountDelete = new Account[accounts.length-1];
            for (int i = 0; i < accountDelete.length; i++) {
                if (i < index) {
                    accountDelete[i] = accounts[i];
                } else accountDelete[i] = accounts[i+1];
            }
            System.out.println("Đã xoá tài khoản có username: "+ username);
            accounts = accountDelete;
        } else {
            System.out.println("Không thấy username, hãy nhập lại: ");
            String username2 = scanner.nextLine();
            delete(username2);
        }
    }
    public void search(String username) {
        int index = checkUsername(username);
        if(index!=-1) {
            System.out.println("Tài khoản ở vị trí thứ "+ (index+1)+accounts[index].toString());
        } else {
            System.out.println("Không thấy username, hãy nhập lại: ");
            String username2 = scanner.nextLine();
            search(username2);
        }
    }

}
