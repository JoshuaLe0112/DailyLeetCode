import org.w3c.dom.Node;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        System.out.println(main.isPalindrome(121));
        System.out.println(main.isPalindrome(12));

        System.out.println(main.reversedInt(12));




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

    public int reversedInt(int x){
        if (x == 0 || x < 0){
            return 0;
        }

        //cup-holder for the reversed int
        int reversed = 0;
        int pop;

        while (x!=0){
            // the last digit: 123 / 10 = 12
            pop  = x % 10;


            x /= 10;

            reversed = (reversed * 10) + pop;
        }
            return  reversed;
    }

    public int [] twoSum (int [] arr, int target){

        for ( int i = 0 ; i < arr.length;i++){
            for (int j = 0 ; j < i + 1;j++){
                int complement = target - arr[i];

                if (arr[j] == complement){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No match");
    }

}



