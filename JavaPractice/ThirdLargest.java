public class ThirdLargest {
    public static void main(String[] args) {
        int[] a = {10,20,20,30,30,30,40,40,40,40,50,50,60,60,60};

        int seclar = 0;
        int thirdlar = 0;

        for(int i=a.length-1; i>0; i--){
            if(a[i]==a[i-1]){
            }
            else{
                seclar = i-1;
                break;

            }
        }
        System.out.println(a[seclar]);

        for(int i=seclar; i>0; i--){
            if(a[i]==a[i-1]){
            }
            else{
                thirdlar = i-1;
                break;
            }
        }
        System.out.println(a[thirdlar]);
    }
}
