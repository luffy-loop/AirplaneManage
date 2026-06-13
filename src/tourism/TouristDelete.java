package tourism;

import java.io.*;

public class TouristDelete {
public void deleteTourist(String travelId) {

    File inputFile = new File("tourists.txt");
    File tempFile = new File("temp.txt");

    boolean found = false;

    try {

        BufferedReader reader =
                new BufferedReader(
                        new FileReader(inputFile));

        BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter(tempFile));

        String line;

        while ((line = reader.readLine()) != null) {

            if (line.contains("Travel ID : " + travelId)) {

                found = true;

                for (int i = 0; i < 7; i++) {
                    reader.readLine();
                }

                continue;
            }

            writer.write(line);
            writer.newLine();
        }

        reader.close();
        writer.close();

        inputFile.delete();
        tempFile.renameTo(inputFile);

        if (found) {
            System.out.println(
                    "\nTourist Deleted Successfully!"
            );
        } else {
            System.out.println(
                    "\nTourist Not Found!"
            );
        }

    } catch (IOException e) {

        System.out.println(
                "Error deleting tourist."
        );
    }
}

}
