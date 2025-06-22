public class AlernateElement {

    public static void main(String args[]) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        int n = arr.length;

        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
