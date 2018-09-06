import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FraudulentActivity {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int retVal=0;
        int totalNoOfDays=expenditure.length;
        int startDataSetPointer=0;
        int startData=0;
        int currentDayDataPointer=d;
        int currentDayData;
        boolean removedFlag=false;
        boolean currentDayCopied=false;
        int tempValue;
        int processCounter=0;
        
        // form and sort initial sub array
        int[] tempArr=new int[d];
        System.arraycopy(expenditure, 0, tempArr, 0,d);
        Arrays.sort(tempArr);
        
        while (currentDayDataPointer<totalNoOfDays) {
        	startData=expenditure[processCounter];
        	currentDayData = expenditure[processCounter+d];
        	
        	//calculate median and check faud
            double median= calculateMedian(d, tempArr);
            if (currentDayData >= 2*median){
            	//System.out.println("Fraud Alert...");
                retVal++;
            }
            startDataSetPointer++;
            currentDayDataPointer++;
            
            //shift Data if there is a need
            if(currentDayData != startData) {
                //int[] tempTempArr = new int[d];
                //int tempTempArrCounter=0;
                int tempArrCounter=0;
                removedFlag=false;
                currentDayCopied=false;
           	
        		int removePosition=0;
        		int addPosition=d-1;
        		boolean removePositionFound=false;
        		boolean addPositionFound=false;
            	for (tempArrCounter=0;tempArrCounter<d;tempArrCounter++) {
            		tempValue=tempArr[tempArrCounter];
            		if (!removePositionFound && tempValue == startData) {
            			removePositionFound=true;
            			removePosition=tempArrCounter;
            		}
            		if (currentDayData <= tempValue) {
            			addPosition=tempArrCounter;
            		}
            	}
            	//System.out.println("addposition="+addPosition+" and removePosition="+removePosition);
            	if (addPosition==removePosition) {
            		tempArr[addPosition]=currentDayData;
            	} else if (addPosition>removePosition) {
            		for (tempArrCounter=removePosition; tempArrCounter<addPosition; tempArrCounter++) {
            			//shift values left
            			tempArr[tempArrCounter]=tempArr[tempArrCounter+1];
            		}
            		tempArr[tempArrCounter]=currentDayData;
            	} else {
            		for (tempArrCounter=addPosition; tempArrCounter<addPosition; tempArrCounter++) {
            			//shift values right
            			int temp=tempArr[tempArrCounter];
            			tempArr[tempArrCounter]=currentDayData;
            			currentDayData=temp;
            		}
            	}
            	//System.out.println("tempArr size="+tempArr.length + "firstValue="+tempArr[0]+"lastvalue="+tempArr[d-1]);
            	//System.out.println(Arrays.toString(tempArr));
            }
            processCounter++;
        } 
        return retVal;
    }
    
    static double calculateMedian(int length, int[] arr) {
    	double retVal =0;
    	if (length % 2 == 1) {
    		retVal = arr[length/2];
    	} else {
    		retVal = (arr[length/2] + arr[(length/2)+1])/2.0;
    	}
    	
    	return retVal;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        System.out.println(String.valueOf(result));
        scanner.close();
    }
}
