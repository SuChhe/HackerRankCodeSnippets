import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Sample input
 * 5
 * 8 1
 * 4 2
 * 5 6
 * 3 1
 * 4 3
 * Sample Output
 * 4 2 5 1 3
 * 
 * @author sumitchheda
 *
 */
public class JimAndOrders {

    // Complete the jimOrders function below.
    static int[] jimOrders(int numOrders, List<OrdersByWaitTime> orders) {
    	int[] returnSet = new int[numOrders];
		System.out.println(orders.toString());
		Collections.sort(orders);
		System.out.println(orders.toString());
		
		for (int counter=0; counter<numOrders; counter++) {
			returnSet[counter]=orders.get(counter).getOrderNumber();
		}
		return returnSet;
    }
 
    public class OrdersByWaitTime implements Comparable<OrdersByWaitTime> {
    	int orderNumber;
    	int waitTime;
    	
    	public OrdersByWaitTime(int a, int b) {
    		super();
    		orderNumber = a;
    		waitTime = b;
    	}
    	
    	public int getOrderNumber() {
    		return orderNumber;
    	}
    	
    	public int getWaitTime() {
    		return waitTime;
    	}

    	@Override
    	public int compareTo(OrdersByWaitTime o) {
    		// TODO Auto-generated method stub
    		return this.waitTime - o.getWaitTime();
    	}
    	
    	public String toString() {
    		return orderNumber + " " + waitTime;
    	}

    }
    	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	JimAndOrders jim=new JimAndOrders();

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<OrdersByWaitTime> orders = new ArrayList<OrdersByWaitTime>();

        for (int i = 0; i < n; i++) {
            String[] ordersRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int orderWait = 0;
            for (int j = 0; j < 2; j++) {
                int ordersItem = Integer.parseInt(ordersRowItems[j]);
                orderWait += ordersItem;
            }
            orders.add(jim.new OrdersByWaitTime(i+1, orderWait));
        }

        int[] result = jimOrders(n, orders);

        for (int i = 0; i < result.length; i++) {
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
