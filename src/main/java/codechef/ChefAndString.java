package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChefAndString {

    private static void checkStringValues(char ch) {
        if (ch != 'x' && ch != 'y') {
            throw new IllegalStateException("Illegal characters present in string!");
        }

    }

    private static Integer getMaxNumberOfPairs(String s) {

        int numberOfPairs = 0;
        if (s.length() >= 2) {
            checkStringValues(s.charAt(0));
            checkStringValues(s.charAt(1));
            if (s.charAt(0) != s.charAt(1)) {
                numberOfPairs++;
            }
        }

        for (int i = (numberOfPairs!=0)?3:2; i < s.length(); ++i) {
            checkStringValues(s.charAt(i));

            if(s.charAt(i)!=s.charAt(i-1)){
                numberOfPairs++;
                i++;
            }

        }

        return numberOfPairs;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {

            String s = br.readLine();

            System.out.println(getMaxNumberOfPairs(s));

        }
    }
}
