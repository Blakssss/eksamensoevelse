package HusEksamen;


public class Room implements Comparable<Room>{
    private int width;
    private int length;

    Room(int width,int length){
        this.width=width;
        this.length=length;
    }
    public int getLength(){
       return length;
    }
    public void setLength(int length){
        this.length=length;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int getWidth(){
        return width;
    }

    @Override
    public String toString() {
        return "" + width + " " + length;
    }

    @Override
    public int compareTo(Room room) {
        int areal1 = this.width*this.length;
        int areal2 = room.width*room.length;
        return Integer.compare(areal1, areal2);
    }
}
