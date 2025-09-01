package JIQ;

public class SortArray {


    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 3, 0, 9, 44, 11};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array");
        for(int num : arr){
            System.out.print(num+ " ");}
    }
}


