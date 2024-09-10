/* Problem: Find the missing number
You are given an array arr containing n-1 distinct integers. The array consists of integers taken from the range 1 to n, meaning one integer is missing from this sequence. Your task is to find the missing integer.

Input :
An integer array arr of size n-1 where the elements are distinct and taken from the range 1 to n.
Example : arr = [1, 2, 4, 5]

Output :
Return the missing integer from the array.
Example: Missing Number : 3

*/


public class second {
    public static int findMissingNumber(int[] arr) {
        // n is the length of the original array, so we get it from arr.length + 1
        int n = arr.length + 1;

        // Total sum of numbers from 1 to n
        int totalSum = n * (n + 1) / 2;

        // Sum of elements in the array
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        // The missing number is the difference between the total sum and the array sum
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4};
        int[] arr4 = {1};
        
        System.out.println("Missing number: " + findMissingNumber(arr1)); // Output: 3
        System.out.println("Missing number: " + findMissingNumber(arr2)); // Output: 1
        System.out.println("Missing number: " + findMissingNumber(arr3)); // Output: 5
        System.out.println("Missing number: " + findMissingNumber(arr4)); // Output: 2
        
        // Example for a large array
        // We can generate an array from 1 to 999999 and test the missing number for 1000000
        int[] largeArray = new int[999999];
        for (int i = 0; i < 999999; i++) {
            largeArray[i] = i + 1;
        }
        System.out.println("Missing number: " + findMissingNumber(largeArray)); // Output: 1000000
    }
}
