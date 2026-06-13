package tourism;

public class Graph {

String[] cities = {
        "Hyderabad",
        "Vizag",
        "Araku Valley",
        "Vijayawada",
        "Warangal"
};

int[][] distance = {
        {0, 620, 680, 280, 150},
        {620, 0, 120, 350, 500},
        {680, 120, 0, 450, 600},
        {280, 350, 450, 0, 200},
        {150, 500, 600, 200, 0}
};

public void displayRoutes() {

    System.out.println("\n========== ROUTE MAP ==========");

    for (int i = 0; i < cities.length; i++) {

        for (int j = i + 1; j < cities.length; j++) {

            System.out.println(
                    cities[i] + " -> " +
                    cities[j] + " : " +
                    distance[i][j] + " KM"
            );
        }
    }
}
}
