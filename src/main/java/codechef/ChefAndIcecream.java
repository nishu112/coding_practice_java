package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Problem statement:
 * https://www.codechef.com/JUNE20B/submit/CHFICRM
 * Number of time failed in Prod :3
 */
class ChefAndIcecream {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    private static void validateCoins(int coin) {
        if (coin == 5 || coin == 10 || coin == 15) {
            return;
        }
        throw new IllegalStateException("Values other than 5,10 and 15 are not allowed.");
    }

    private static String isItPossibleToFulfilAllRequest(int[] coins) {
        String[] resultArray = { "NO", "YES" };

        int isItPossible = 1;

        int n = coins.length;

        Map<Integer, Integer> coinsFrequency = new HashMap<Integer, Integer>();
        coinsFrequency.put(0, Integer.MAX_VALUE);
        coinsFrequency.put(5, 0);
        coinsFrequency.put(10, 0);
        coinsFrequency.put(15, 0);

        int numberOfCoins;
        int changeRequired;

        for (int i = 0; i < n; ++i) {
            validateCoins(coins[i]);
            coinsFrequency.put(coins[i], coinsFrequency.get(coins[i]) + 1);
            changeRequired = coins[i] - 5;
            if (coinsFrequency.containsKey(changeRequired) && coinsFrequency.get(changeRequired) > 0) {
                numberOfCoins = coinsFrequency.get(changeRequired);

                coinsFrequency.put(changeRequired, numberOfCoins - 1);

            } else if (coins[i] == 15 && coinsFrequency.containsKey(5) && coinsFrequency.get(5) > 1) {
                numberOfCoins = coinsFrequency.get(5);
                coinsFrequency.put(5, numberOfCoins - 2);

            } else {
                isItPossible = 0;
                break;
            }

        }

        return resultArray[isItPossible];
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        int testCases = fr.nextInt();

        while (testCases-- > 0) {
            int n = fr.nextInt();

            int[] coins = new int[n];

            for (int i = 0; i < n; ++i) {
                coins[i] = fr.nextInt();
            }

            System.out.println(isItPossibleToFulfilAllRequest(coins));
        }
    }

}
