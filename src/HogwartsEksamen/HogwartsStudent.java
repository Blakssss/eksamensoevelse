package HogwartsEksamen;

import java.util.ArrayList;
import java.util.Collections;

public class HogwartsStudent implements Comparable<HogwartsStudent>{
    private String firstName;
    private String lastName;
    private House house;

    HogwartsStudent(String firstName, String lastName, House house){
        this.firstName=firstName;
        this.lastName=lastName;
        this.house=house;
    }

    public void setHouse(House house) {
        if(house != House.GRYFFFINDOR && house!=House.SLYTHERIN && house!=House.HUFFLEPUFF && house!=House.RAVENCLAW){
            throw new RuntimeException();
        }
        this.house=house;
    }

    @Override
    public int compareTo(HogwartsStudent hogwartsStudent){
        return this.lastName.compareTo(hogwartsStudent.lastName);
    }

    @Override
    public String toString() {
        return "" + firstName+ lastName + house;
    }

    public static void main(String[] args) {
        HogwartsStudent hogwartsStudent = new HogwartsStudent("Harry","Potter",House.GRYFFFINDOR);
        HogwartsStudent hogwartsStudent1 = new HogwartsStudent("Ron", "Weasley",House.GRYFFFINDOR);
        hogwartsStudent1.setHouse(House.HJEM);
        ArrayList<HogwartsStudent> hogwartsStudents = new ArrayList<>();
        hogwartsStudents.add(hogwartsStudent);
        hogwartsStudents.add(hogwartsStudent1);
        Collections.sort(hogwartsStudents);
        System.out.println(hogwartsStudents);
    }
}
