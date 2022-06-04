package CompareTo;

import java.util.ArrayList;
import java.util.Collections;

public class Blomst implements Comparable<Blomst>{
    int size;

    Blomst(int size){
        this.size =size;
    }

    @Override
    public int compareTo(Blomst blomst){
        if(this.size > blomst.size)
            return 1;
        else if(this.size < blomst.size)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        ArrayList<Blomst> blomster = new ArrayList<>();
        blomster.add(new Blomst(23));
        blomster.add(new Blomst(12));
        blomster.add(new Blomst(142));
        Collections.sort(blomster);
        for(Blomst blomst: blomster){
            System.out.println(blomst.size);
        }
    }
}
