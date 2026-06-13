package tourism;

import java.io.FileWriter;
import java.io.IOException;

public class TouristManager {

	private static int nextId = loadLastId();
	
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


        } catch (IOException e) {
            System.out.println("Error saving tourist data.");
        }
    }
    
    private static int loadLastId() {
    	try {

    	    java.io.File file =
    	            new java.io.File("tourists.txt");

    	    if (!file.exists()) {
    	        return 101;
    	    }

    	    java.io.BufferedReader reader =
    	            new java.io.BufferedReader(
    	                    new java.io.FileReader(file));

    	    String line;
    	    int lastId = 100;

    	    while ((line = reader.readLine()) != null) {

    	        if (line.startsWith("Travel ID")) {

    	            String id =
    	                    line.split(":")[1].trim();

    	            int number =
    	                    Integer.parseInt(
    	                            id.replace("YT", "")
    	                    );

    	            lastId = number;
    	        }
    	    }

    	    reader.close();

    	    return lastId + 1;

    	} catch (Exception e) {

    	    return 101;
    	}
   

    	}

}