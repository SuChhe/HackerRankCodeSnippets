import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FrequencyQueries {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<int[]> queries) {
    	Iterator<int[]> queriesIterator = (Iterator<int[]>) queries.iterator();
    	List<Integer> returnList = new ArrayList<Integer>();
    	Map <Integer, Integer> tempList = new HashMap<Integer, Integer>();
    	while (queriesIterator.hasNext()) {
    		int[] querySet = (int[])queriesIterator.next();
    		if (querySet != null) {
    			int queryType = querySet[0];
    			int value = querySet[1];
    			if (queryType==1) {
    				// add value to list
    				addValue(tempList, value);
    			}
    			if (queryType==2) {
    				//remove value from list
    				removeValue(tempList, value);
    			}
    			if (queryType==3) {
    				//search in list
    				if(findReps(tempList, value)) {
    					returnList.add(1);
    				} else {
    					returnList.add(0);
    				}
    			}
    		}
    	}
    	return returnList;
    }
    
    static void addValue (Map<Integer,Integer> list, Integer value) {
    	if (list.containsKey(value)) {
    		list.put(value, list.get(value)+1);
    	} else {
    		list.put(value, 1);
    	}
    	System.out.println(list.toString());
    }
    
    static void removeValue (Map<Integer,Integer> list, Integer value) {
    	Integer count= list.get(value);
    	int intCount=0;
    	if (count != null) {
    		intCount = Integer.parseInt(count.toString());
    	} else {
    		return;
    	}
    	/*if (intCount == 1) {
    		list.remove(value);
    	} else {*/
    		intCount--;
    		list.replace(value, new Integer(intCount));
    	//}
    	System.out.println(list.toString());
    }
    
    static boolean findReps(Map<Integer,Integer> list, Integer value) {
    	for (Integer listValue:list.values()) {
    		if (listValue.equals(value)) {
    			return true;
    		}
    	}
    	return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<int[]> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int[] queriesRowItems = new int[2];

            for (int j = 0; j < 2; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems[j]=queriesItem;
            }
            queries.add(queriesRowItems);
        }

        List<Integer> ans = freqQuery(queries);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(String.valueOf(ans.get(i)));

            if (i != ans.size() - 1) {
                System.out.println();
            }
        }


        bufferedReader.close();
    }
    /*public static void main(String[] args) {
    	Map<Integer,Integer> list = new HashMap<Integer,Integer>();
    	//System.out.println(1+list.get(1));
    	list.put(1,1);
    	list.put(1,2);
    	list.put(1, 3);
    	System.out.println(list.get(1));
    	
    }*/
}
