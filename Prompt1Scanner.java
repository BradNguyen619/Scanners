import java.util.Scanner;

public class Prompt1Scanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNext()) {
                String str = scanner.next();
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        Prompt1Scanner myScanner = new Prompt1Scanner();
        myScanner.run();
    }
}
