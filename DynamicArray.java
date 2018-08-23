import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DynamicArray {

    // Complete the dynamicArray function below.
    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    	List<Integer> returnList = new ArrayList<Integer>();
    	Map<Integer, List<Integer>> seqMap = new HashMap<Integer, List<Integer>>();
    	Iterator<List<Integer>> outerIterator = queries.iterator() ;
    	int lastAnswer = 0 ;
    	int queryType = 0;
    	int xValue = 0;
    	int yValue = 0;
    	List<Integer> tempList = null;
    	while (outerIterator.hasNext()) {
    		List<Integer> innerList= outerIterator.next();
    		Iterator<Integer> innerIterator = innerList.iterator();
    		if (innerIterator.hasNext()) {
    			queryType = Integer.parseInt(innerIterator.next().toString());
    		} else {
    			System.out.println("Error1");
    		}
    		if (innerIterator.hasNext()) {
    			xValue = Integer.parseInt(innerIterator.next().toString());
    		} else {
    			System.out.println("Error 2");
    		}
    		if (innerIterator.hasNext()) {
    			yValue = Integer.parseInt(innerIterator.next().toString());
    		} else {
    			System.out.println("Error 3");
    		}
    		if (queryType ==1) {
    			int seq=((xValue^lastAnswer) % n);
    			if (seqMap.get(seq) != null) {
    				seqMap.get(seq).add(new Integer(yValue));
    			} else {
    				tempList=new ArrayList<Integer>();
    				tempList.add(new Integer(yValue));
    				seqMap.put(new Integer(seq), tempList); 
    			}
    		}
    		else if (queryType == 2) {
    			int seq=((xValue^lastAnswer) % n);
    			tempList = seqMap.get(seq); 
    			if (tempList != null) {
    				int index=yValue;
    				if (yValue>1)
    					index=(yValue%tempList.size());
    				
					lastAnswer = Integer.parseInt(tempList.get(index).toString());
					returnList.add(tempList.get(index));
    			} else {
    				System.out.println("Error 5");
    			}
    		} else {
    			System.out.println("Invalid Query");
    		}
    	}
    	System.out.println("Return list "+returnList.toString());
    	return returnList;

    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nq = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nq[0]);

        int q = Integer.parseInt(nq[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                System.out.print("\n");
            }
        }

        System.out.println();

        bufferedReader.close();
    }
}
