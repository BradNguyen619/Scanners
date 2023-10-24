import java.util.Scanner;

public class Prompt3Scanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int numbers = scanner.nextInt();
                System.out.println(numbers*3);
            }
        }
    }

    public static void main(String[] args) {
        Prompt3Scanner myScanner = new Prompt3Scanner();
        myScanner.run();
    }
}
