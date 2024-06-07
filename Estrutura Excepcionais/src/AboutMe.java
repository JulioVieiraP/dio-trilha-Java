import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome");
            String name = scanner.next();

            System.out.println("digite sua idade");
            int age = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("deve ser um numero");
        }

        
    }
}