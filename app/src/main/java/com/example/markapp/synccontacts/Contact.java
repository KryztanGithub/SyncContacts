package com.example.markapp.synccontacts;

public class Contact {

    String name;
    int phonenumber;
    String birthday;

    public Contact(String name, int phonenumber, String birthday) {
        this.setName(name);
        this.setPhonenumber(phonenumber);
        this.setBirthday(birthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
