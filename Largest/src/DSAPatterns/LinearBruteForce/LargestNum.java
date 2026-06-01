package DSAPatterns.LinearBruteForce;

import java.util.*;

public class LargestNum {
    public static int largestNum(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7};
        System.out.println(largestNum(numbers));
    }
}
