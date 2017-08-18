package ua.task.car.entity.utility.human;

import java.util.Date;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public class Human {
    private String name;
    private Date birthDate;
    private Gender gender;
    private BloodGroup bloodGroup;

    public Human() {
    }

    public Human(String name, Date birthDate, Gender gender, BloodGroup bloodGroup) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
    }

    public Human(Human human){
        this.name = human.getName();
        this.birthDate = human.getBirthDate();
        this.gender = human.getGender();
        this.bloodGroup = human.getBloodGroup();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "Human{"
                + "name='" + name + '\''
                + ", birthDate=" + birthDate
                + ", gender=" + gender
                + ", bloodGroup=" + bloodGroup
                + '}';
    }
}
