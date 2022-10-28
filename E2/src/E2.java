import java.util.Scanner;

public class E2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a text to output: ");
        String output = scanner.nextLine();

        System.out.println("Please insert how many times you want to repeat that: ");
        int multipler = scanner.nextInt();

        System.out.println("The output is:");

        for (int i = 0; i < multipler; i++) {
            System.out.println(output);    
        }

        scanner.close();     
    }
}