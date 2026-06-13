package tourism;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TouristSearch {

    public void searchTourist(String travelId) {

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("tourists.txt"));

            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {

            	if (line.toUpperCase().contains(
            	        travelId.toUpperCase())){

                    found = true;

                    System.out.println("\n===== TOURIST FOUND =====");
                    System.out.println(line);

                    for (int i = 0; i < 6; i++) {

                        System.out.println(
                                reader.readLine()
                        );
                    }

                    break;
                }
            }

            if (!found) {

                System.out.println(
                        "Tourist Not Found!"
                );
            }

            reader.close();

        } catch (IOException e) {

            System.out.println(
                    "Error reading file."
            );
        }
    }
}