import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = validateInput("= Enter name: ", "Username is Wrong. Allow input only text.", "[a-zA-Z]+");

        String ageInput = validateInput("= Enter age: ", "Age allow input only number.", "\\d+");
        int age = Integer.parseInt(ageInput);

        String phoneNumber = validateInput("= Enter phone number: ", "Phone number allow input only number and just start with 0.", "0\\d{9}");

        String email = validateInput("= Enter email: ", "Wrong format. Example: phon.sobon@gmail.com", "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");

        System.out.println("================ PERSON INFORMATION ================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
    private static String validateInput(String prompt, String errorMessage, String regex) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            String userInput = scanner.nextLine();
            if (userInput.matches(regex)) {
                return userInput;
            } else {
                System.out.println(errorMessage);
            }
        }
    }
}
