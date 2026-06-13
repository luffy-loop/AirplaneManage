package tourism;

public class BudgetOptimizer {
public void optimizeBudget(int budget) {

    String[] packages = {
            "Araku Valley",
            "Borra Caves",
            "Charminar",
            "Tirupati",
            "Goa"
    };

    int[] cost = {
            2000,
            1500,
            1000,
            2500,
            5000
    };

    int[] value = {
            8,
            6,
            5,
            9,
            10
    };

    int n = packages.length;

    int[][] dp = new int[n + 1][budget + 1];

    for (int i = 0; i <= n; i++) {

        for (int w = 0; w <= budget; w++) {

            if (i == 0 || w == 0) {

                dp[i][w] = 0;

            } else if (cost[i - 1] <= w) {

                dp[i][w] = Math.max(
                        value[i - 1]
                                + dp[i - 1][w - cost[i - 1]],
                        dp[i - 1][w]
                );

            } else {

                dp[i][w] = dp[i - 1][w];
            }
        }
    }

    System.out.println("\n===== BUDGET OPTIMIZER =====");
    System.out.println("Budget : ₹" + budget);
    System.out.println("Maximum Travel Value : "
            + dp[n][budget]);
}
}
