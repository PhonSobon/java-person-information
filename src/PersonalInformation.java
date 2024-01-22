import java.util.Scanner;
import java.util.regex.Pattern;

public class PersonalInformation {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input name
            String name;
            do {
                System.out.print("= Enter name: ");
                name = scanner.nextLine();
                if (!isValidName(name)) {
                    System.out.println("Username is Wrong. Allow input only text.");
                }
            } while (!isValidName(name));

            // Input age
            int age;
            do {
                System.out.print("=> Enter age: ");
                String ageInput = scanner.nextLine();
                age = convertToValidAge(ageInput);
                if (age == -1) {
                    System.out.println("Age allow input only number.");
                }
            } while (age == -1);

            // Input phone number
            String phoneNumber;
            do {
                System.out.print("= Enter phone number: ");
                phoneNumber = scanner.nextLine();
                if (!isValidPhoneNumber(phoneNumber)) {
                    System.out.println("Phone number allow input only number and just start with 0.");
                }
            } while (!isValidPhoneNumber(phoneNumber));

            // Input email
            String email;
            do {
                System.out.print("=> Enter email: ");
                email = scanner.nextLine();
                if (!isValidEmail(email)) {
                    System.out.println("Wrong format. Example: koko@gmail.com");
                }
            } while (!isValidEmail(email));

            // Display person information
            System.out.println("================ SHOW PERSON INFORMATION ================");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Email: " + email);
        }

        // Validate name (allow only text)
        private static boolean isValidName(String name) {
            return name.matches("[a-zA-Z]+");
        }

        // Validate age (allow only numbers)
        private static int convertToValidAge(String ageInput) {
            try {
                return Integer.parseInt(ageInput);
            } catch (NumberFormatException e) {
                return -1;
            }
        }

        // Validate phone number (allow only numbers starting with 0)
        private static boolean isValidPhoneNumber(String phoneNumber) {
            return phoneNumber.matches("0\\d+");
        }

        // Validate email format
        private static boolean isValidEmail(String email) {
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            return Pattern.matches(emailRegex, email);
        }


}
