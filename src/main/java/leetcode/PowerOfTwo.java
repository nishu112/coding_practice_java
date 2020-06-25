package leetcode;

/**
 * Problem statement:
 *
 * Given an integer, write a function to determine if it is a power of two.
 *
 * https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3354/
 *
 * Number of times failed in prod:2
 *
 * 1. Missed case when n=0
 * 2. n was having Integer.MIN value
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        long number =n;
        return ((number!=0)&&(number&(number-1))==0);
    }


}
