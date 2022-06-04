package DreamEksamen;


import java.util.ArrayList;
import java.util.Collections;

public class Dream implements Comparable<Dream> {
    double date;
    int duration;
    Type type;

    public Dream(double date, int duration, Type type){
        this.date=date;
        this.duration=duration;
        this.type=type;
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
        if(dream.date < this.date){
            return 1;
        }
        if(dream.date > this.date){
            return -1;
        }
        return 0;
    }

    public String toString(){
        return "" + date + " " + duration + " " + type;
    }

    public static void main(String[] args) {
        Dream dream1 = new Dream(12.9,10,Type.WET);
        Dream dream2 = new Dream(12.5,11,Type.DRY);
        Dream dream3 = new Dream(20.1,20,Type.NIGHTMARE);
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
