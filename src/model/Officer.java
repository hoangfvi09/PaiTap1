package model;

public class Officer {
    private String fullName;
    private int age;
    private String gender;
    private String address;
    private int id;

    public Officer() {
    }

    public Officer(String fullName, int age, String gender, String address, int id) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }
}
