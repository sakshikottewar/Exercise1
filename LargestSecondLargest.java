
public class LargestSecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num =0;num<arr.length;num++) {

            if (arr[num] > largest) {
                secondLargest = largest;
                largest = arr[num];
            } 
            else if (arr[num] > secondLargest && arr[num] != largest) {
                secondLargest = arr[num];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
