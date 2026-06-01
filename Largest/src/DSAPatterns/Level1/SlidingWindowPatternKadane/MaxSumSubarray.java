package DSAPatterns.Level1.SlidingWindowPatternKadane;

public class MaxSumSubarray {
    public static void maxSumSubarray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum=0;
                for (int k = i; k <= j; k++) {
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void kadane(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currSum+=numbers[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7};
        kadane(numbers);
    }
}
