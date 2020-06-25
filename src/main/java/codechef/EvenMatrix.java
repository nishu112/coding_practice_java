package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class EvenMatrix {

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

    private static void printSprialMatrix(int n) {

        int left = 0, right = n - 1;
        int up = 0, down = n - 1;
        int[][] M = new int[n][n];

        int counter = 0;

        while (left <= right) {

            for (int i = left; i <= right; ++i) {
                ++counter;
                M[up][i] = counter;
            }

            up++;

            for (int i = up; i <= down; ++i) {
                ++counter;
                M[i][right] = counter;
            }

            right--;

            for (int i = right; i >= left; --i) {
                ++counter;
                M[down][i] = counter;
            }

            down--;

            for (int i = down; i >= up; --i) {
                ++counter;
                M[i][left] = counter;
            }

            left++;

        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        int testCases = fr.nextInt();

        while (testCases-- > 0) {
            int n = fr.nextInt();

            printSprialMatrix(n);
        }
    }

}
