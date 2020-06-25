package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class TheTomAndJerryGame {

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

    private static long getPossibleWaysToWin(long number) {

        while (number % 2 == 0) {
            number /= 2;
        }

        return (number - 1) / 2;
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        int testCases = fr.nextInt();

        while (testCases-- > 0) {
            long number = fr.nextLong();

            System.out.println(getPossibleWaysToWin(number));
        }
    }
}
