package RandomTalEksamen;

import java.util.Random;

public class RandomNumbers {
    Random random = new Random();
    int randomNumber;

    public void myNumber(){
        int myNumber = 7;
        while(randomNumber != myNumber){
            randomNumber = random.nextInt(1,10);
            System.out.println(randomNumber);
        }
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.myNumber();
    }
}
