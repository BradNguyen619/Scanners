import java.util.Scanner;

public class Prompt2Scanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int numbers = scanner.nextInt();
                System.out.println(numbers);
            }
        }
    }

    public static void main(String[] args) {
        Prompt2Scanner myScanner = new Prompt2Scanner();
        myScanner.run();
    }
}
