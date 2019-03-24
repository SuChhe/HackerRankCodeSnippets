import java.util.*;

import com.sun.glass.ui.Timer;
    
    
    /**
     * In computer science, a double-ended queue (dequeue, often 
     * abbreviated to deque, pronounced deck) is an abstract data 
     * type that generalizes a queue, for which elements can be added 
     * to or removed from either the front (head) or back (tail).
     * 
     * Deque interfaces can be implemented using various types of 
     * collections such as LinkedList or ArrayDeque classes. 
     * For example, deque can be declared as:
     * 
     * 
     * In this problem, you are given N integers. You need to find the 
     * maximum number of unique integers among all the possible contiguous 
     * subarrays of size M.

     * Deque deque = new LinkedList<>();
     * or
     * Deque deque = new ArrayDeque<>();
     * @author sumitchheda
     *
     */
    public class DequeExample {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int maxUnique = 0;
            Set tempSet= new HashSet<>();
            boolean flag = true;
            long time=0;;

            for (int i = 0; i < n; i++) {
            	if (flag) {
            		time=System.currentTimeMillis();
            		flag = false;
            	}
                int num = in.nextInt();
                deque.addLast(num);
                tempSet.add(num);
                if (i >= m-1) {
                	/**
                	 * Remove an element from deque and if no other copy of the
                	 * element remains in the 
                	 **/
                	int tempMax = tempSet.size();
                	if (maxUnique < tempMax) {
                		maxUnique = tempMax;
                	}
                	int first = (int)deque.remove();
                	tempSet.remove(first);
                }
            }
            time = time-System.currentTimeMillis();
            System.out.println(time);
            System.out.println(maxUnique);
        }
    }



