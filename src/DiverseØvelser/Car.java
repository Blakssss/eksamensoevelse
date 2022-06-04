package DiverseØvelser;

public class Car extends Vehicle {
    private String name = "nonono";
    private String model;
    private String color;
    private int year;

    public void setModel(String model){
        this.model=model;
    }
    public void showModel(){
        System.out.println("THis is an: " + model);
    }
}
