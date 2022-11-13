package model;
//(int id, String username, String password,String phone, Date birthday).
//        Quản lý Account.
//        1.Hiển thị tài khoản.
//        2.Thêm tài khoản mới.
//        3.Sửa password theo username.
//        4.Xóa tài khoản theo username.
//        5.Tìm tài khoản theo username.
//        6.Thoát.

public class Account {
    private int id;
    private String username;
    private String password;
    private String phone;
    private String birthday;

    public Account() {
    }

    public Account(int id, String username, String password, String phone, String birthday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return " Account { " +
                "id = " + id +
                ", username ='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
