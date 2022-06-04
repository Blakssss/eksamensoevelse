package Interface;


public class Apple implements Fruit {


    private int price = 0;
    private String name;
    private int weight = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void showData(){
        System.out.println(price);
        System.out.println(name);
        System.out.println(weight);
    }

    public void rotten() {

    }

}
