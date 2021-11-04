import java.util.ArrayList;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith("a") || list.get(i).startsWith("A")) {
                count++;
            }
        }
        return count;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + "!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int x: list1) {
            for (int y: list2) {
                if (x == y) return true;
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int count = 0;
        for (int x: list) {
            if (x % 2 != 0) count++;
        }
        return count;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        for (int y: arr) {
            x.add(y);
        }
        return x;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> newList = new ArrayList<>();
        while (list1.size() > 0 && list2.size() > 0) {
            if (list1.get(0) < list2.get(0)) {
                newList.add(list1.get(0));
                list1.remove(0);
            }
            else {
                newList.add(list2.get(0));
                list2.remove(0);
            }
        }

        while (list1.size() > 0) {
            newList.add(list1.get(0));
            list1.remove(0);
        }

        while (list2.size() > 0) {
            newList.add(list2.get(0));
            list2.remove(0);
        }

        return newList;
    }



    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
