package codechef;


import com.google.common.base.Functions;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Ordering;

import java.util.HashMap;
import java.util.Map;

public class TestSample {

    private static Map<String, String> getMap1() {
        Map<String, String> result = new HashMap<String, String>();

        result.put("Walmart", "Walmart");
        result.put("Walmart_hello", "Walmart_hello");
        result.put("Betten-ABC", "Betten-ABC");
        return result;
    }

    private static Map<String, String> getMap2() {
        Map<String, String> result = new HashMap<String, String>();

        result.put("Betten-ABC", "betten-abc");


        return result;
    }

    public static void main(String[] args) {
        Map<String, String> hashTable = new HashMap<String, String>();

        hashTable.putAll(getMap1());
        hashTable.putAll(getMap2());

        Ordering<String> valueComparator = Ordering.natural().onResultOf(Functions.forMap(hashTable));
        Map<String, String> sortedOutput = ImmutableSortedMap.copyOf(hashTable, valueComparator);

        System.out.println(sortedOutput);

    }
}
