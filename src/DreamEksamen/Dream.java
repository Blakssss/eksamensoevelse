package DreamEksamen;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Dream implements Comparable<Dream> {
    LocalDate dato;
    int duration;
    Type type;

    public Dream(int duration, Type type,LocalDate dato){
        this.duration=duration;
        this.type=type;
        this.dato=dato;
    }

    public boolean isPleasant(Dream dream){
        if(dream.type == Type.NIGHTMARE){
            System.out.println("Dream wasn't pleasant");
            return false;
        }
        if(dream.type == Type.DRY && dream.duration > 10){
            System.out.println("Dream was pleasant");
            return true;
        }
        else if(dream.type == Type.DRY && dream.duration <= 10){
            System.out.println("Dream wasn't pleasant");
            return false;
        }
        if(dream.type == Type.WET && dream.duration < 10){
            System.out.println("Dream was pleasant");
            return true;
        }
        else
            System.out.println("Dream wasn't pleasant");
            return false;
    }

    @Override
    public int compareTo(Dream dream){
        return this.dato.compareTo(dream.dato);
    }

    public String toString(){
        return "" + dato + " " + duration + " " + type;
    }

    public static void main(String[] args) {
        Dream dream1 = new Dream(10,Type.WET,LocalDate.of(1999,1,1));
        Dream dream2 = new Dream(11,Type.DRY,LocalDate.of(1999,2,1));
        Dream dream3 = new Dream(20,Type.NIGHTMARE,LocalDate.of(2000,4,2));
        dream1.isPleasant(dream1);
        dream2.isPleasant(dream2);
        dream3.isPleasant(dream3);
        ArrayList<Dream> dreams = new ArrayList<>();
        dreams.add(dream1);
        dreams.add(dream2);
        dreams.add(dream3);
        Collections.sort(dreams);
        System.out.println(dreams);
    }
}
