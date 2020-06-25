package interviewbit;

import java.util.ArrayList;


//Submitted
//But not complete here.
public class Flip {
    public ArrayList<Integer> flip(String A) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        int n = A.length();
        int[] zeroCount = new int[A.length() + 1];
        int[] oneCount = new int[A.length() + 1];

        boolean isZeroExist = false;
        for (int i = 0; i < A.length(); ++i) {
            if (A.charAt(i) == '0') {
                zeroCount[i + 1] = 1;
                isZeroExist =true;
            } else {
                oneCount[i + 1] = 1;
            }
        }

        if(!isZeroExist){
            return result;
        }

        int maxSum = 0;
        int currSum =0;

        int leftLimit = 0;
        int rightLimit = 0;

        for (int i = 1; i <= n; ++i) {

            if(currSum < currSum+zeroCount[i]-oneCount[i]){
                currSum = currSum+zeroCount[i]-oneCount[i];
                rightLimit =i;
            } else{
                leftLimit=i;
            }
            currSum = Math.max(currSum,currSum+zeroCount[i]-oneCount[i]);


        }

        result.add(leftLimit);
        result.add(rightLimit);

        return result;
    }
}
