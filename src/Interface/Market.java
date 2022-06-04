package Interface;


import java.util.Objects;

public class Market {
    public static void main(String[] args) {
        Apple a = new Apple();
        Apple b = new Apple();
        a.setName("hello");
        a.setPrice(10);


        System.out.println(a.getName());
        System.out.println(a.getPrice());
        b.setPrice(10);
        b.setName("hello");
        if(a.getPrice()==b.getPrice()){
            System.out.println("Equal");
        }
        if(Objects.equals(a.getName(), b.getName())){
            System.out.println("Equal");
        }
        a.showData();

    }
}
