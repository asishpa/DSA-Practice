package dsa.array;

import java.util.HashMap;

public class MajorityElementOccursNBy2TimesUsingHashing {
    public static int findElement(int[] arr) {
        int n = arr.length;
        int threshold = n / 2;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) > threshold) {
                return num;
            }
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int element = findElement(arr);
        System.out.println("The element is " + element);
    }
}
