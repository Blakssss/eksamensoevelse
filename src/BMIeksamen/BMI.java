package BMIeksamen;

public class BMI {
    private double height;
    private int weight;
    private double minBMI;

    BMI(double height, int weight){
        this.height=height;
        this.weight=weight;
    }
    public double calculate(BMI bmi){
        minBMI = bmi.weight/(bmi.height*2);
        return minBMI;
    }
    public boolean isUnderWeight(){
        return minBMI < 18.5;
    }
    public boolean isOverWeight(){
        return minBMI > 25;
    }
    public boolean isNormalWeight(){
        return minBMI > 18.5 && minBMI < 25;
    }

    public static void main(String[] args){
        BMI bmi = new BMI(1.80,80);
        System.out.println(bmi.calculate(bmi));
        System.out.println(bmi.isNormalWeight());
        System.out.println(bmi.isOverWeight());
        System.out.println(bmi.isUnderWeight());
    }
}
