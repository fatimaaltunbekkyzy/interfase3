import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Task 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soz jazunuz");
        String soz = scanner.nextLine();

        UppercaseFormatter uppercaseFormatter = new UppercaseFormatter();
        String soz1 = uppercaseFormatter.formatMessage(soz);
        System.out.println("Чон тамгалар мене: " + soz1);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        LowerCaseFormatter lowerCaseFormatter = new LowerCaseFormatter();
        String soz2 = lowerCaseFormatter.formatMessage(soz);
        System.out.println("Кичине тамгалар менен: " + soz2);
    }
}
