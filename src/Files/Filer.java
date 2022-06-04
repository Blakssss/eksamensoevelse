package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Filer {
    public void read() {
        File file = new File("Text.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("wtf");
            e.printStackTrace();

        }
    }
    public void write() throws FileNotFoundException {
        File file = new File("Text.txt");
        PrintStream printStream = new PrintStream(file);
        printStream.println("Hello World");
        printStream.println("Goodbye");
    }
    public void read2() {
        File file2 = new File("text2.txt");
        try {
            Scanner input = new Scanner(file2);
            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        }
            catch(FileNotFoundException e){
                System.out.println("File doesn't exist.");
            }
    }
    public void write2() throws FileNotFoundException {
        File file2= new File("text2.txt");
        PrintStream printStream = new PrintStream(file2);
        printStream.println("Hello?");
    }

    public void read3() throws FileNotFoundException{
        File file = new File("text3.txt");
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            System.out.println(input.nextLine());
        }
    }
    public void write3() throws FileNotFoundException{
        File file = new File("text3.txt");
        PrintStream printStream = new PrintStream(file);
        printStream.println("hello Doom Slayer");
        printStream.println("hello Vecna");
    }


    public static void main(String[] args) throws FileNotFoundException {
        Filer filer = new Filer();
        filer.write();
        filer.read();
        filer.write3();
        filer.read3();
    }
}
