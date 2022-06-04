package DiverseØvelser;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class All {
    Scanner input = new Scanner(System.in);
    private String hello = "hello";
    String world = " world";
    String whyHere = "why here";
    String s = hello + world;
    int yo = 2;
    double no = 2.2;
    boolean yes = true;
    int[] numbers = {1,2,3,4,5,6};

    public String getHello(){
        return hello;
    }
    public void setHello(String hello){
        this.hello=hello;
    }

    public All(Scanner input,String hello,String world,String whyHere,String s, int yo, double no, boolean yes, int[] numbers){
        this.input=input;
        this.hello=hello;
        this.world=world;
        this.whyHere=whyHere;
        this.s=s;
        this.yo=yo;
        this.no=no;
        this.yes=yes;
        this.numbers=numbers;
    }

    public All() {

    }

    public void change(){
        for(int number: numbers){
            System.out.println(number);
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 3){
                int position = i;
                System.out.println("The number you were looking for is at: " + i + " and the number there was: " + numbers[i]);
            }
        }
        numbers[0] = 3;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);
        System.out.println(numbers.length);
        int answer = input.nextInt();
        System.out.println(answer);
        System.out.println(s);
        hello = hello.concat(world);
        System.out.println(hello);
        do{yo--;
            System.out.println(yo);
        }while(yo > 0);
        System.out.println(hello.charAt(3));
        System.out.println(hello.toUpperCase(Locale.ROOT));
        System.out.println(whyHere.indexOf("here"));
        System.out.println(whyHere.substring(2,5));
    }

    public static void main(String[] args) {
        new All().change();
    }
}
