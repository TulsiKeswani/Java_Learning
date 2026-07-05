import java.util.ArrayList;
import java.util.Scanner;

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
    }
}