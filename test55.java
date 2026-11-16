import java.util.Arrays;

public class test55 {

    public static void main(String[] args) {
        int[][] dist = {
                { 0, 10, 15, 20 },
                { 10, 0, 35, 25 },
                { 15, 35, 0, 30 },
                { 20, 25, 30, 0 }
        };

        int n = dist.length;
        int INF = 1_000_000_000;
        int[][] dp = new int[1 << n][n];

        for (int[] row : dp) {
            Arrays.fill(row, INF);
        }

        dp[1][0] = 0;

        for (int mask = 1; mask < (1 << n); mask++) {
            for (int pos = 0; pos < n; pos++) {
                if ((mask & (1 << pos)) != 0) {
                    for (int next = 0; next < n; next++) {
                        if ((mask & (1 << next)) == 0) {
                            int nextMask = mask | (1 << next);
                            dp[nextMask][next] = Math.min(dp[nextMask][next], dp[mask][pos] + dist[pos][next]);
                        }
                    }
                }
            }
        }

        int minTourCost = INF;
        int fullMask = (1 << n) - 1;
        for (int pos = 1; pos < n; pos++) {
            minTourCost = Math.min(minTourCost, dp[fullMask][pos] + dist[pos][0]);
        }

        System.out.println("Minimum Travelling Salesman Tour Cost: " + minTourCost);
    }
}
