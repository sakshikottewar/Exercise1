public class MergeSort {

    static void merge(int[] a, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (a[i] < a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }

        while (i <= mid)
            temp[k++] = a[i++];

        while (j <= right)
            temp[k++] = a[j++];

        for (i = 0; i < temp.length; i++)
            a[left + i] = temp[i];
    }

    static void sort(int[] a, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            sort(a, left, mid);
            sort(a, mid + 1, right);

            merge(a, left, mid, right);
        }
    }

    public static void main(String[] args) {

        int[] a = {5, 3, 8, 1, 2};

        sort(a, 0, a.length - 1);

        for (int x : a)
            System.out.print(x + " ");
    }
}