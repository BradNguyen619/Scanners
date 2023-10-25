import java.util.Scanner;

public class Prompt4Scanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in).useDelimiter(",|\\n");
        while (true) {
            if (scanner.hasNext()) {
                String str = scanner.next();
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        Prompt4Scanner myScanner = new Prompt4Scanner();
        myScanner.run();
    }
}
