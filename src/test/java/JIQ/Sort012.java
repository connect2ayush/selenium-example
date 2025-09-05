package JIQ;

import java.util.Arrays;

public class Sort012 {
// count 0,1,2 fill the array index using while loop

    public static void main(String[] args) {
        int a[]={1,2,0,2,1,0,1,1,1,0};
        int countOfZeros=0;
        int countOfOnes=0;
        int countOfTwos=0;
        int size = a.length;
        for (int i = 0; i <size ; i++) {
            if(a[i]==0){
                countOfZeros ++;
            } else if (a[i]==1) {
                countOfOnes ++;
            }
            else countOfTwos ++;
        }

        int index=0;
        while (countOfZeros-->0){
            a[index++]=0;
        }
        while (countOfOnes-->0){
            a[index++]=1;
        }
        while (countOfTwos-->0){
            a[index++]=2;
        }

        System.out.println("Sorted Array " + Arrays.toString(a));
    }

}
