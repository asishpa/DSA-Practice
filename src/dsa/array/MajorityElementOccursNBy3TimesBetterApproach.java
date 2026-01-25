/*
 * Time Complexity:  O(N)
 * Space Complexity: O(N)
 */
package dsa.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementOccursNBy3TimesBetterApproach {

    static List<Integer> findMajorityElement(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Add elements appearing more than n/3 times (max 2 elements possible)
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 3) {
                ans.add(entry.getKey());
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = findMajorityElement(arr);

        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
            if (i != ans.size() - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
