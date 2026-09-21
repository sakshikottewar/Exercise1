public class ReverseString {
    public static void main(String[] args) {

        String str = "hello";

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        String reverse = new String(arr);

        System.out.println("Reverse: " + reverse);
    }
}