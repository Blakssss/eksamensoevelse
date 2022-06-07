package DiverseØvelser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class All implements Interface{
    Scanner input = new Scanner(System.in);
    private String hello = "hello";
    String world = " world";
    String whyHere = "why here";
    String s = hello + world;
    int yo = 2;
    double no = 2.2;
    boolean yes = true;
    int[] numbers = {1,2,3,4,5,6};


    @Override
    public void showMe(){
        System.out.println("Show me what you got");
    }
    public String getHello(){
        return hello;
    }
    public void setHello(String hello){
        this.hello=hello;
    }
    public void write() throws FileNotFoundException {
        File file = new File("textss.txt");
        PrintStream printStream = new PrintStream(file);
        printStream.println("Hello World");
        printStream.println("Hello you");
    }
    public void read() throws FileNotFoundException {
        File file = new File("textss.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
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

    public void setInput(Scanner input){
        this.input=input;
    }
    public Scanner getInput(){
        return input;
    }

    public All() {

    }
    public void makingSwitch(){
        switch (yo){
            case 1 -> System.out.println("it's 1");
            case 2 -> System.out.println("its' 2");
            default -> System.out.println("it's no number");
        }
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

    public static void main(String[] args) throws FileNotFoundException {

        All all = new All();
        all.write();
        all.read();
    }
}
