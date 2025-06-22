public class CountSmallerThanGivenNo {

    public static void main(String args[]){
        int[] arr = {10,7,20,60};
        int num = 9;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<num){
                count++;
            }
        }
        System.out.println("Elements smaller than " + num + ": " + count);
    }
}
