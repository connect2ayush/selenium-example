package Collections;
import java.util.ArrayList;

public class ArrayListConcept {


    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
            arr.add('a');
            arr.add('b');
            arr.add('c');

            for(int i=0;i<arr.size();i++){
                System.out.print(" " +arr.get(i));
            }
        System.out.println("\n");

        System.out.println(arr.size());

    }

}
