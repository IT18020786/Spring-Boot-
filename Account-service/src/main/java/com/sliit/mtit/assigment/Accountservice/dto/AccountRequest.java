package com.sliit.mtit.assigment.Accountservice.dto;

public class AccountRequest {

    private String fullNAme;
    private String age;
    private String address;

    public String getFullNAme() {
        return fullNAme;
    }

    public void setFullNAme(String fullNAme) {
        this.fullNAme = fullNAme;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AccountRequest{" +
                "fullNAme='" + fullNAme + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
