package model;

public class Engineer extends Officer {
    private String major;

    public Engineer() {
    }

    public Engineer(String fullName, int age, String gender, String address, int id, String major) {
        super(fullName, age, gender, address, id);
        this.major = major;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "model.Engineer{" +
                "fullName= "+super.getFullName()+'\'' +
                "age= "+super.getAge()+'\'' +
                "gender= "+super.getGender()+'\'' +
                "address= " + super.getAddress()+'\'' +
                "major='" + major + '\'' +
                ", id=" + getId() +'\'' +
                '}';
    }
}
