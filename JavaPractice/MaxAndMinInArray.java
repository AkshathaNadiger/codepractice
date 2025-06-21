//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MaxAndMinInArray {
    public static void main(String[] args) {

        // TODO: Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33

        // TODO: Initialize min and max with the first element

        // TODO: Use an enhanced for loop to find min and max

        // TODO: Print the smallest and largest numbers

        int[] a = {1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5};

        int max = a[0];

        int min =  a[0];

        for(int i=0; i<a.length; i++){
           if(max < a[i]){
               max = a[i];

               System.out.println(max);

           }

            if(min > a[i]){
                min = a[i];

            }
        }
        System.out.println(max);

        System.out.println(min);

    }
}