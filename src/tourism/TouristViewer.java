package tourism;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TouristViewer {

public void viewTourists() {

    try {

        BufferedReader reader = new BufferedReader(
                new FileReader("tourists.txt"));

        String line;

        System.out.println("\n========== REGISTERED TOURISTS ==========\n");

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();

    } catch (IOException e) {

        System.out.println("No tourist records found.");
    }
}
}
