import java.util.Hashtable;
import java.util.Arrays;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for (int i = 0; i < order.length; i++) {
            ht.put(order[i], i);
        }

        Integer[] arr = new Integer[friends.length];
        for (int i = 0; i < friends.length; i++) {
            arr[i] = friends[i];
        }
             Arrays.sort(arr, (a, b) -> ht.get(a) - ht.get(b));

        int[] result = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}
