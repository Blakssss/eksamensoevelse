package DiverseØvelser;

public class DateAge {
    private int yourAge;
    private int dateAge;
    private int lowest = 0;


    DateAge(int yourAge, int dateAge){
        this.yourAge=yourAge;
        this.dateAge=dateAge;
    }
    public int lowest(DateAge dateAge){
        lowest = dateAge.yourAge / 2 + 7;
        return lowest;

    }
    public boolean tooYoung(){
        if(dateAge < lowest){
            System.out.println("She too young, dude");
            return true;
        }else
            System.out.println("You good fam, you ain't going to jail");
        return false;
    }
    public static void main(String[] args){
        DateAge dateAge = new DateAge(50,16);
        dateAge.lowest(dateAge);
        dateAge.tooYoung();
    }
}
