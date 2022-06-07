package NamesEksamen;

import java.util.Arrays;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;
    private String[] fullName;

    Names(String fullName){
        this.fullName = fullName.split(" ");
    }

    public String toString(){
        return "" + Arrays.toString(fullName);
    }

    public static void main(String[] args) {
        Names names = new Names("Mathias Blak");
        System.out.println(names);
    }
}
