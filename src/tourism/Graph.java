package tourism;

public class Graph {
private int[][] graph = {
        {0, 620, 680, 280, 150},
        {620, 0, 120, 350, 500},
        {680, 120, 0, 450, 600},
        {280, 350, 450, 0, 200},
        {150, 500, 600, 200, 0}
};

private String[] cities = {
        "Hyderabad",
        "Vizag",
        "Araku Valley",
        "Vijayawada",
        "Warangal"
};

public void dijkstra(int source) {

    int n = graph.length;

    int[] distance = new int[n];
    boolean[] visited = new boolean[n];

    for (int i = 0; i < n; i++) {
        distance[i] = Integer.MAX_VALUE;
    }

    distance[source] = 0;

    for (int count = 0; count < n - 1; count++) {

        int u = minDistance(distance, visited);

        visited[u] = true;

        for (int v = 0; v < n; v++) {

            if (!visited[v]
                    && graph[u][v] != 0
                    && distance[u] != Integer.MAX_VALUE
                    && distance[u] + graph[u][v] < distance[v]) {

                distance[v] = distance[u] + graph[u][v];
            }
        }
    }

    System.out.println("\n===== SHORTEST DISTANCES =====");

    for (int i = 0; i < n; i++) {

        System.out.println(
                cities[source] +
                " -> " +
                cities[i] +
                " : " +
                distance[i] +
                " KM"
        );
    }
}

private int minDistance(int[] distance, boolean[] visited) {

    int min = Integer.MAX_VALUE;
    int minIndex = -1;

    for (int i = 0; i < distance.length; i++) {

        if (!visited[i] && distance[i] <= min) {

            min = distance[i];
            minIndex = i;
        }
    }

    return minIndex;
}

public void displayCities() {

System.out.println("\n===== AVAILABLE CITIES =====");

for (int i = 0; i < cities.length; i++) {

    System.out.println((i + 1) + ". " + cities[i]);
}
}

public String getCityName(int index) {

return cities[index];

}



}
