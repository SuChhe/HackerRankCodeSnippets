import java.io.*;
import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        int inCount = scanner.nextInt();
        List<List<Integer>> masterList = new ArrayList<List<Integer>>();
        for (int i=0; i<inCount; i++) {
            int listSize = scanner.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j< listSize; j++) {
                list.add(scanner.nextInt());
            }
            masterList.add(list);
        }
        int queryCount = scanner.nextInt();
        for (int i = 0; i<queryCount; i++) {
            int l = scanner.nextInt();
            int b = scanner.nextInt();
            if (l > inCount || b > masterList.get(l-1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(masterList.get(l-1).get(b-1));
            }
            
        }
    }
}