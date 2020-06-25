package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RandomizedSet {

    public List<Integer> arr;
    public HashMap<Integer, Integer> map;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        arr = new ArrayList<Integer>();
        map = new HashMap<Integer, Integer>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, arr.size());
        arr.add(val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int index = map.get(val);
            int temp = arr.get(arr.size() - 1);
            arr.set(index, temp);
            arr.remove(arr.size() - 1);
            map.put(temp, index);
            map.remove(val);
            return true;
        }
        return false;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        int random_int = (int) (Math.random() * (arr.size()));
        return arr.get(random_int);
    }
}
