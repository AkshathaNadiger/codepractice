public class RemoveDuplicates {



        public static void main(String args[]){
            int[] arr = {1,1,2,2,3,3,4,5};

            int n = removeDuplicates(arr);

            System.out.println("After Removing duplicates:");
            for(int i=0; i<n; i++){
                System.out.print
                        (arr[i]+ " ");
            }
        }

        public static int removeDuplicates(int[] arr) {
            if (arr.length == 0) {
                return 0;
            }
            int i = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] != arr[i]) {
                    i++;
                    arr[i] = arr[j];
                }
            }
            return i + 1;
        }
}
