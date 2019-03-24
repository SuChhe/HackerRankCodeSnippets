import java.io.*;
import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        int countNums = scanner.nextInt();
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0 ; i< countNums; i++) {
            nums.add(scanner.nextInt());
        }
        System.out.println(nums.toString());
        
        int numQueries = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i< numQueries; i++) {
        	String action = scanner.nextLine();
        	String values = scanner.nextLine();
            if (action.equals("Insert")){
                int index = Integer.parseInt(values.split(" ")[0]);
                int value = Integer.parseInt(values.split(" ")[1]);
                nums.add(index, value);
            }
            if (action.equals("Delete")) {
            	int index = Integer.parseInt(values);
                nums.remove(index);
            }
        }
        nums.forEach(num -> System.out.print(num+" "));
    }
}