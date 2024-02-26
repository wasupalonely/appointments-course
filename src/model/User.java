package model;

public abstract class User {
    private static int id;
    private String name;
    public String email;
    public String address;
    public String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("Debe ser dde 8 dígitos");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }

    }

    @Override
    public String toString() {
        return "model.User: " + name + ", Email " + email +
                "\n Address " + address + "Phone " + phoneNumber;
    }

    public abstract void showDataUser ();
}
