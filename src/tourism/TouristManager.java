package tourism;

import java.io.FileWriter;
import java.io.IOException;

public class TouristManager {

    private static int nextId = 101;

    public String generateTravelId() {
        return "YT" + nextId++;
    }

    public void saveTourist(Tourist tourist) {

        try {
            FileWriter writer = new FileWriter("tourists.txt", true);

            writer.write("Travel ID : " + tourist.getTravelId() + "\n");
            writer.write("Name : " + tourist.getName() + "\n");
            writer.write("Age : " + tourist.getAge() + "\n");
            writer.write("Gender : " + tourist.getGender() + "\n");
            writer.write("Phone : " + tourist.getPhone() + "\n");
            writer.write("Budget : " + tourist.getBudget() + "\n");
            writer.write("Category : " + tourist.getCategory() + "\n");
            writer.write("----------------------------------\n");

            writer.close();

            System.out.println("\nTourist Registered Successfully!");
            System.out.println("Travel ID: " + tourist.getTravelId());

        } catch (IOException e) {
            System.out.println("Error saving tourist data.");
        }
    }
}