package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FlereFiler {
    File file = new File("pølse.txt");
    public void write() throws FileNotFoundException {
        PrintStream printStream = new PrintStream(file);
        printStream.println("Hvorfor virker det her?");
        printStream.println("Ved det ikke");

    }
    public void read() throws FileNotFoundException{
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        FlereFiler filer = new FlereFiler();
        filer.write();
        filer.read();
    }
}
