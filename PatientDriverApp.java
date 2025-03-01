
/*
 * Class: CMSC203 
 * Instructor:
 * Description: Driver class to create and display Patient and Procedure objects.
 * Due: MM/DD/YYYY
 * Platform/compiler: JDK 17, IntelliJ IDEA
 * I pledge that I have completed the programming assignment independently.
 * Print your Name here: [Your Name]
 */
import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input patient information
        System.out.println("Patient Info:");
        System.out.print("Full Name (First Middle Last): ");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.trim().split("\\s+", 3); // Split into at most 3 parts

        // Extract first, middle, and last names
        String firstName = nameParts.length > 0 ? nameParts[0] : "";
        String middleName = nameParts.length > 1 ? nameParts[1] : "";
        String lastName = nameParts.length > 2 ? nameParts[2] : "";

        System.out.print("Address (Street, City, State ZIP): ");
        String addressLine = scanner.nextLine();
        String[] addressParts = addressLine.trim().split(",", 4); // Split into at most 4 parts

        // Extract address components
        String streetAddress = addressParts.length > 0 ? addressParts[0].trim() : "";
        String city = addressParts.length > 1 ? addressParts[1].trim() : "";
        String state = addressParts.length > 2 ? addressParts[2].trim() : "";
        String zipCode = addressParts.length > 3 ? addressParts[3].trim() : "";

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Emergency Contact Name: ");
        String emergencyContactName = scanner.nextLine();
        System.out.print("Emergency Contact Phone: ");
        String emergencyContactPhone = scanner.nextLine();

        // Create Patient object
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode,
                                      phoneNumber, emergencyContactName, emergencyContactPhone);

        // Display patient information
        displayPatient(patient);

        // Input procedure information
        System.out.println("\nEnter Procedure Information:");
        System.out.println("Procedure 1:");
        System.out.print("Name: ");
        String p1Name = scanner.nextLine();
        System.out.print("Date: ");
        String p1Date = scanner.nextLine();
        System.out.print("Practitioner: ");
        String p1Practitioner = scanner.nextLine();
        System.out.print("Charges: ");
        double p1Charges = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Procedure procedure1 = new Procedure(p1Name, p1Date, p1Practitioner, p1Charges);

        System.out.println("Procedure 2:");
        System.out.print("Name: ");
        String p2Name = scanner.nextLine();
        System.out.print("Date: ");
        String p2Date = scanner.nextLine();
        Procedure procedure2 = new Procedure(p2Name, p2Date);
        System.out.print("Practitioner: ");
        String p2Practitioner = scanner.nextLine();
        procedure2.setPractitionerName(p2Practitioner);
        System.out.print("Charges: ");
        double p2Charges = scanner.nextDouble();
        procedure2.setCharges(p2Charges);
        scanner.nextLine(); // Consume newline

        System.out.println("Procedure 3:");
        Procedure procedure3 = new Procedure();
        System.out.print("Name: ");
        procedure3.setProcedureName(scanner.nextLine());
        System.out.print("Date: ");
        procedure3.setProcedureDate(scanner.nextLine());
        System.out.print("Practitioner: ");
        procedure3.setPractitionerName(scanner.nextLine());
        System.out.print("Charges: ");
        procedure3.setCharges(scanner.nextDouble());

        // Display procedure information
        System.out.println("\nProcedures:");
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("\nTotal Charges: $%,.2f\n", totalCharges);

        // Input student name, MC#, and due date
        System.out.print("Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("MC#: ");
        String mcNumber = scanner.nextLine();
        System.out.print("Due Date (MM/DD/YYYY): ");
        String dueDate = scanner.nextLine();

        // Display student information
        System.out.println("\nStudent Information:");
        System.out.println("Student Name: " + studentName);
        System.out.println("MC#: " + mcNumber);
        System.out.println("Due Date: " + dueDate);

        scanner.close();
    }

    // Method to display patient information
    public static void displayPatient(Patient patient) {
        System.out.println("\n" + patient.toString());
    }

    // Method to display procedure information
    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString());
    }

    // Method to calculate total charges
    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
    }
}