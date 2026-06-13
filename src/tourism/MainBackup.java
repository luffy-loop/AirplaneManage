package tourism;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    TouristManager manager = new TouristManager();
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
    String destination = "";

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
    DestinationManager dm = new DestinationManager();

    dm.displayCategoryDestinations(category);

    int destinationChoice;

    while (true) {

        try {

            System.out.print("Select Destination (1-3): ");
            destinationChoice = Integer.parseInt(sc.nextLine());

            if (destinationChoice >= 1 && destinationChoice <= 3) {
                break;
            }

            System.out.println("Invalid Choice!");

        } catch (NumberFormatException e) {

            System.out.println("Enter numbers only.");
        }
    }

    switch (category) {

        case "Nature":
            destination = (destinationChoice == 1) ? "Araku Valley"
                    : (destinationChoice == 2) ? "Lambasingi"
                    : "Munnar";
            break;

        case "Adventure":
            destination = (destinationChoice == 1) ? "Borra Caves"
                    : (destinationChoice == 2) ? "Rishikesh"
                    : "Manali";
            break;

        case "Historical":
            destination = (destinationChoice == 1) ? "Charminar"
                    : (destinationChoice == 2) ? "Golconda Fort"
                    : "Hampi";
            break;

        case "Religious":
            destination = (destinationChoice == 1) ? "Tirupati"
                    : (destinationChoice == 2) ? "Varanasi"
                    : "Srisailam";
            break;

        case "Beach":
            destination = (destinationChoice == 1) ? "Goa"
                    : (destinationChoice == 2) ? "RK Beach"
                    : "Kovalam";
            break;
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
    System.out.println("Destination  : " + destination);
    
    Graph graph = new Graph();

    graph.displayCities();

    System.out.print("\nSelect Source City (1-5): ");

    try {
    int source = Integer.parseInt(sc.nextLine());

    if (source >= 1 && source <= 5) {

    	String sourceCity = "";

    	switch(source) {

    	    case 1:
    	        sourceCity = "Hyderabad";
    	        break;

    	    case 2:
    	        sourceCity = "Vizag";
    	        break;

    	    case 3:
    	        sourceCity = "Araku Valley";
    	        break;

    	    case 4:
    	        sourceCity = "Vijayawada";
    	        break;

    	    case 5:
    	        sourceCity = "Warangal";
    	        break;
    	}

    	System.out.println("\n========================================");
    	System.out.println("           ROUTE DETAILS");
    	System.out.println("========================================");

    	System.out.printf("%-18s : %s%n", "Source City", sourceCity);
    	System.out.printf("%-18s : %s%n", "Destination", destination);

    	int distance = 0;

    	if(destination.equals("Tirupati"))
    	    distance = 560;
    	else if(destination.equals("Varanasi"))
    	    distance = 1400;
    	else if(destination.equals("Srisailam"))
    	    distance = 220;
    	else if(destination.equals("Goa"))
    	    distance = 620;
    	else if(destination.equals("Hampi"))
    	    distance = 380;
    	else if(destination.equals("Charminar"))
    	    distance = 15;
    	else
    	    distance = 300;

    	System.out.printf("%-18s : %d KM%n",
    	        "Distance", distance);

    	System.out.printf("%-18s : %d Hours%n",
    	        "Travel Time", distance / 60);
    	
        System.out.println("\n========================================");
        System.out.println("          BOOKING CONFIRMED");
        System.out.println("========================================");

        System.out.printf("%-15s : %s%n", "Travel ID", travelId);
        System.out.printf("%-15s : %s%n", "Tourist", name);
        System.out.printf("%-15s : %s%n", "Category", category);
        System.out.printf("%-15s : %s%n", "Destination", destination);

        System.out.println("========================================");

        System.out.println("Thank you for choosing YatraSphere!");
        System.out.println("Have a safe journey.");

        
        Hotel[] hotels;

        if (destination.equals("Goa")) {

            hotels = new Hotel[] {
                new Hotel("Goa Beach Resort", 6000, 4.9),
                new Hotel("Sea View Goa", 4500, 4.8),
                new Hotel("Budget Goa Stay", 2500, 4.5)
            };

        } else if (destination.equals("Hampi")) {

            hotels = new Hotel[] {
                new Hotel("Hampi Heritage Resort", 4500, 4.9),
                new Hotel("Royal Hampi Stay", 3500, 4.7),
                new Hotel("Budget Hampi Inn", 2200, 4.4)
            };

        } else if (destination.equals("Charminar")) {

            hotels = new Hotel[] {
                new Hotel("Hyderabad Grand", 5000, 4.8),
                new Hotel("Nizam Residency", 3500, 4.6),
                new Hotel("Budget Hyderabad Inn", 2000, 4.3)
            };

        } else if (destination.equals("Tirupati")) {

            hotels = new Hotel[] {
                new Hotel("Tirupati Residency", 3000, 4.8),
                new Hotel("Balaji Comforts", 2500, 4.6),
                new Hotel("Temple View Inn", 1800, 4.4)
            };

        } else {

            hotels = new Hotel[] {
                new Hotel("Luxury Stay", 6000, 4.9),
                new Hotel("Taj Residency", 4500, 4.8),
                new Hotel("Budget Inn", 1800, 4.0)
            };
        }

        		MergeSort sorter = new MergeSort();

        		sorter.sortByRating(hotels, 0, hotels.length - 1);

        		System.out.println("\n===== HOTEL RECOMMENDATIONS =====");

        		for (Hotel hotel : hotels) {
        		System.out.println(hotel);
        		

        		}
        		
        BudgetOptimizer optimizer =
        				new BudgetOptimizer();

        				optimizer.optimizeBudget(
        				(int) budget
        				);

        				TouristSearch search =
        				        new TouristSearch();

        				System.out.print(
        				        "\nEnter Travel ID to Search: "
        				);

        				String searchId =
        				        sc.nextLine();

        				search.searchTourist(searchId);

    } else {

        System.out.println("Invalid City Choice!");
    }
    } catch (NumberFormatException e) {
    System.out.println("Enter numbers only.");

    }


    sc.close();
}
}
