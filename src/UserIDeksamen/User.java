package UserIDeksamen;

import java.util.Locale;
import java.util.Random;

public class User {
    private String fullName;
    private String userID;

    User(String fullName, String userID){
        this.fullName=fullName;
        this.userID=userID;

    }
    public boolean validUserID(String userID){
        String first = userID.substring(0,3);
        String second = userID.substring(4);

        for (int i = 0; i < first.length(); i++) {
            if (!Character.isLowerCase(first.charAt(i)))
                return false;
        }

        for (int i = 0; i < second.length(); i++) {
            if(!Character.isDigit(second.charAt(i)))
                return false;
        }
        return true;
    }
    public void createUserId(String fullName){
        Random random = new Random();
        String numberName = "";
        for (int i = 0; i < 4; i++) {
            numberName = numberName + random.nextInt((9)+1);
        }

        String userID1 = fullName.substring(0,2);

        String[] newName = fullName.split(" ");

        String userID2 = newName[1];
        userID2 = userID2.substring(0,2);

        String finalName = userID1+userID2+numberName;

        finalName = finalName.toLowerCase(Locale.ROOT);

        System.out.println(finalName);
    }

    public static void main(String[] args) {
        User user = new User("Mathias Blak","mabl1234");
        System.out.println(user.validUserID(user.userID));
        user.createUserId("Anders Madsen");
    }
}
