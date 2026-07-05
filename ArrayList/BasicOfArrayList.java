import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class BasicOfArrayList{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        // Creating ArrayList

        ArrayList<Integer> list = new ArrayList<>();

        // Add Operation -> O(1)

        list.add(5);
        list.add(7);
        list.add(11);
        list.add(10);

        // Print list
        System.out.println(list);

        // Get Element -> O(1)
        System.out.println(list.get(2));

        // Remove Element -> 0(n);

        list.remove(2);

        System.out.println(list);

        // set element -> O(1)
        list.set(2,49);
        System.out.println(list);

        // Add element at specific index -> O(n)

        list.add(1,11);
        System.out.println(list);

        // check If Element present in arraylist -> o(n)
        System.out.println(list.contains(11));

        // Check size of the arraylist
        System.out.println(list.size());

        // Loops On ArrayList

        System.out.println("Looping On ArrayList");

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        // Print Reverse ArrayList

        for(int i = list.size() -1;  i>=0; i--){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        // Find Maximum IN ArrayList

        ArrayList<Integer> l = new ArrayList<>();

        l.add(10);
        l.add(3);
        l.add(140);
        l.add(1);
        l.add(7);

        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < l.size(); i++){
            maximum = Math.max(maximum,l.get(i));
        }

        System.out.println("Maximum Value is : " + maximum);

        // Swap 2 Numbers in ArrayList

            int idx1 = 1;
            int idx2 = 3;

            l.clear();
            l.addAll(Arrays.asList(2,5,9,3,6));

            System.out.println("Before Swap --> " + l);
            int temp = l.get(idx1);
            l.set(idx1,l.get(idx2));
            l.set(idx2,temp);

            System.out.println("After Swap --> " + l);

            // Sorting ArrayList --> Ascending Order

            Collections.sort(l);
            System.out.println(l);

            // Sorting ArrayList --> Decending order
            Collections.sort(l,Collections.reverseOrder());
            System.out.println(l);
    }
}