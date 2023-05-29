package de.ait.models;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String ageString;
    private double height;

    public User(String firstName, String lastName, int age, double height) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age ;
        this.height = height;
    }



    public String getAgeString() {
        return ageString;
    }

    public void setAgeString(String ageString) {
        this.ageString = ageString;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}
