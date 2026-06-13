package tourism;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    TouristManager manager = new TouristManager();
    
    Graph graph = new Graph();

    graph.dijkstra(0);


    System.out.println("========== YatraSphere ==========");

    String name;

    while (true) {
        System.out.print("Enter Name: ");
        name = sc.nextLine().trim();

        if (name.matches("[a-zA-Z ]+")) {
            break;
        } else {
            System.out.println("Invalid Name! Name should contain only letters.");
        }
    }

    int age;

    while (true) {

        System.out.print("Enter Age: ");

        try {

            age = Integer.parseInt(sc.nextLine());

            if (age >= 18 && age <= 100) {
                break;
            } else {
                System.out.println("Age must be between 18 and 100.");
            }

        } catch (NumberFormatException e) {

            System.out.println("Invalid Age! Please enter numbers only.");
        }
    }

    String gender;

    while (true) {

        System.out.print("Enter Gender (M/F/O): ");
        gender = sc.nextLine().trim();

        if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("Male")) {

            gender = "Male";
            break;

        } else if (gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("Female")) {

            gender = "Female";
            break;

        } else if (gender.equalsIgnoreCase("O") || gender.equalsIgnoreCase("Other")) {

            gender = "Other";
            break;

        } else {

            System.out.println("Invalid Gender! Enter M, F or O.");
        }
    }

    String phone;

    while (true) {

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();

        if (phone.matches("\\d{10}")) {
            break;
        } else {
            System.out.println("Invalid Phone Number! Enter exactly 10 digits.");
        }
    }

    double budget;

    while (true) {

        System.out.print("Enter Budget: ");

        try {

        	String budgetInput = sc.nextLine().replace(",", "");
        	budget = Double.parseDouble(budgetInput);

            if (budget > 0) {
                break;
            } else {
                System.out.println("Budget must be greater than 0.");
            }

        } catch (NumberFormatException e) {

            System.out.println("Invalid Budget! Please enter numbers only.");
        }
    }

    System.out.println("\nSelect Category");
    System.out.println("1. Nature");
    System.out.println("2. Adventure");
    System.out.println("3. Historical");
    System.out.println("4. Religious");
    System.out.println("5. Beach");

    int choice;
    String category = "";

    while (true) {

        System.out.print("Enter Choice: ");

        try {

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    category = "Nature";
                    break;

                case 2:
                    category = "Adventure";
                    break;

                case 3:
                    category = "Historical";
                    break;

                case 4:
                    category = "Religious";
                    break;

                case 5:
                    category = "Beach";
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    continue;
            }

            break;

        } catch (NumberFormatException e) {

            System.out.println("Invalid Input!");
        }
    }

    String travelId = manager.generateTravelId();

    Tourist tourist = new Tourist(
            travelId,
            name,
            age,
            gender,
            phone,
            budget,
            category
    );

    manager.saveTourist(tourist);

    System.out.println("\n=================================");
    System.out.println(" Tourist Registered Successfully ");
    System.out.println("=================================");

    System.out.println("Travel ID : " + travelId);
    System.out.println("Name      : " + name);
    System.out.println("Category  : " + category);

    sc.close();
}
}
