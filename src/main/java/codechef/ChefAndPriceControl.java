package codechef;

import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndPriceControl {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            String[] input = br.readLine().split(" ");

            int k = Integer.parseInt(input[1]);

            int n = Integer.parseInt(input[0]);

            String[] arr = br.readLine().split(" ");

            int loss = 0;
            for (int i = 0; i < n; ++i) {
                loss += Math.max(Integer.parseInt(arr[i]) - k, 0);
            }

            System.out.println(loss);

        }
    }
}
