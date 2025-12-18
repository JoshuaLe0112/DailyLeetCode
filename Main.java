import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        int [] arr = {2,7,11,15};

        main.twoSumII(arr,9);

    }

    public boolean isPalindrome(int x) {

        //0 is a palindrome number
        if (x == 0) {
            return true;

            //check if the value is negative or is a 1 digit number
        } else if (x < 0 || x % 10 == 0) {
            return false;
        }

        //reversed place holder
        int reversed = 0;
        while (x > reversed) {

            //
            int pop = x % 10;
            //
            x /= 10;

            //
            reversed = (reversed * 10) + pop;

        }

        if (x == reversed || x == reversed / 10) {
            return true;
        } else {
            return false;
        }

    }

    public int reversedInt(int x) {
        if (x == 0 || x < 0) {
            return 0;
        }

        //cup-holder for the reversed int
        int reversed = 0;
        int pop;

        while (x != 0) {
            // the last digit: 123 / 10 = 12
            pop = x % 10;


            x /= 10;

            reversed = (reversed * 10) + pop;
        }
        return reversed;
    }

    public int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                int complement = target - arr[i];

                if (arr[j] == complement) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No match");
    }

    //12/15/2025
    public double MedianSortedArray(int[] arr1, int[] arr2) {

        int length1 = arr1.length;
        int length2 = arr2.length;
        int length3 = length1 + length2;

        int k = 0;
        int median = 0;

        int[] arr3 = new int[length3];

        //intialize value of 1 and 2 to 3
        for (int i = 0; i < arr1.length; i++) {
            arr3[k++] += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[k++] += arr2[i];
        }

        Arrays.sort(arr3);
        median = arr3.length;

        if (median % 2 == 1) {
            return (double) arr3[median / 2];
        } else {
            int middle1 = arr3[median / 2 - 1];
            int middle2 = arr3[median / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }

    }

    //12/16/2025
    public int[] twoSumII(int[] numbers, int target) {

        Arrays.sort(numbers);
        int left = 0;
        int right = numbers.length;

        while (left < right){
            int sum = numbers[left] + numbers[right];

            if (sum == target){
                return new int[] {left+1,right+1};
            }else if (sum < target){
                left++;
            }else {
                right--;
            }

        }
        throw new IllegalArgumentException("error");
    }

    //12/17/2025
    public boolean containDuplicate(int [] arr){

       Set<Integer> uniqueElement = new HashSet<Integer>();
       List<Integer> duplicate = new ArrayList<Integer>();

        for (int item : arr){

            if (!uniqueElement.add(item)){
                duplicate.add(item);
                return true;
            }
        }
       return false;
    }

}


