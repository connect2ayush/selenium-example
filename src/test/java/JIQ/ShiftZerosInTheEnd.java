package JIQ;

public class ShiftZerosInTheEnd {

    public static void ShiftZerosInTheEnd(int a[]){
        // find non zeros and in iteration then move non zero to left 2. fill rest of places with 0
        int j=0;

        for (int i = 0; i < a.length; i++) {
                if(a[i] !=0) {
                    a[j] = a[i];
                    j++;
                }
        }

        while (j<a.length){
           a[j]=0;
           j++;
        }

        System.out.println("Output ");
    for(int i=0;i<a.length;i++){
        System.out.print(a[i] + " ");
    }
    }

    public static void main(String[] args) {
        int arr[]={2,0,1,0,7,9,0};
        ShiftZerosInTheEnd(arr);

    }
}
