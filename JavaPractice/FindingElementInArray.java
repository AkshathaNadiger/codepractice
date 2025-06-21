public class FindingElementInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        int key = 40;
        int position = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]==key){
                position = i;
                //System.out.println("Element found at position: "+ i);
            }
          //  else {
               // System.out.println("element not found");
          //  }
        }
        System.out.println("Element found at position: "+ position);
    }
}
