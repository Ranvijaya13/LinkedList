
import java.util.*;

class ListDemo {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(23);
        myList.add(12);
        myList.add(45);
        myList.add(78);
        myList.add(54);
        myList.add(92);
        int size = myList.size();
        for (Integer num : myList) {
            System.out.println(num);
        }

        System.out.println("Print in reverse");

        for (int i = size - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }
        System.out.println("");
        System.out.println("Print the Index value ");
        System.out.print("Enter the Index Value=");
        int n = ran.nextInt();
        System.out.println("");
        System.out.println(myList.get(n));
    }
}
