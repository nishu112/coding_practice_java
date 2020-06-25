package codechef;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MAXMEX {

    private static Integer getMEX(int m, int[] arr) {

        Set<Integer> st = new HashSet<Integer>();

        int sameElementCount = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < m) {
                st.add(arr[i]);
            }
            if (arr[i] == m) {
                sameElementCount++;
            }
        }

        if (st.size() == m - 1) {
            return arr.length - sameElementCount;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt();
            }

            System.out.println(getMEX(m, arr));

        }

    }
}
