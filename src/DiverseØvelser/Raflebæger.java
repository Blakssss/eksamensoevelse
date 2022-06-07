package DiverseØvelser;

import java.util.Arrays;
import java.util.Random;

public class Raflebæger {
    private int terninger;
    private int[] øjne = new int[6];

    Raflebæger(int terninger){
        this.terninger=terninger;
    }
    public  int ryst(){
        int alleØjne = 0;
        for (int i = 0; i < øjne.length; i++){
            Random random = new Random();
            øjne[i] = random.nextInt(5)+1;
            alleØjne = alleØjne + random.nextInt();
        }
        return alleØjne;
    }
    public int[] se(){
        System.out.println(Arrays.toString(øjne));
        return øjne;
    }
    public static void main(String[] args){
        Raflebæger raflebæger= new Raflebæger(6);
        raflebæger.ryst();
        raflebæger.se();
    }
}
