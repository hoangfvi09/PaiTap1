package model;

import model.Officer;

public class Worker extends Officer {
    private int level;

    public Worker() {
    }

    public Worker(String fullName, int age, String gender, String address, int id, int level) {
        super(fullName, age, gender, address, id);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "model.Worker{" +
                "fullName= "+getFullName()+'\'' +
                "age= "+getAge()+'\'' +
                "gender= "+getGender()+'\'' +
                "address= " + getAddress()+'\'' +
                "level=" + level +
                ", id=" + getId() +'\'' +
                '}';
    }

}
