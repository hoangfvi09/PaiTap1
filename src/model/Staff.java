package model;

import model.Officer;

public class Staff extends Officer {
    private String work;

    public Staff() {
    }

    public Staff(String fullName, int age, String gender, String address, int id, String work) {
        super(fullName, age, gender, address, id);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "model.Staff{" +
                "fullName= "+getFullName()+'\'' +
                "age= "+getAge()+'\'' +
                "gender= "+getGender()+'\'' +
                "address= " + getAddress()+'\'' +
                "work='" + work + '\'' +
                ", id=" + getId() +'\'' +
                '}';
    }
}



