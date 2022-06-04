package DiverseØvelser;

import java.util.ArrayList;

public class Broker {

    public static void main(String[] args) {
        int answer = 0;
        int o = 0;
        Car car1 = new Car();
        Car car2 = new Car();
        try{
            car1.setModel("model");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        car1.showModel();
        Object car3 = new Car();
        System.out.println(car1.navn);


        ////////////////////////////////////////////////


        for(int i = 0; i < 5; i++) {
            System.out.print("+");
        }
        System.out.println();
        for (int y = 0; y < 5; y++) {
            System.out.print("+");
        }
        System.out.println();
        for (int x = 0; x < 5; x++) {
            System.out.print("+");
        }
        System.out.println();


        ////////////////////////////////////////////////


        do{
            o = o + 10;
            System.out.print(o);
        }while(o < 100);


        ////////////////////////////////////////////////


        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(66);
        a.add(12);
        a.add(87);
        a.add(66);
        a.add(56);
        a.add(89);
        a.add(66);
        for (int i = 0; i < a.size(); i++){
            answer = a.get(i);
            if(answer == 89){
                System.out.println();
                System.out.println(answer);
            }
            if(a.get(i) == 87){
                a.remove(i);
            }
            System.out.println(a.get(i));
        }


        ////////////////////////////////////////////////


    }
}