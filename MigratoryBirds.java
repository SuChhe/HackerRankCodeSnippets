import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int[] counter=new int[]{0,0,0,0,0,0,0};
        for(int a:arr){
            counter[a]++;
        }
        System.out.println(Arrays.toString(counter));
        int largest=1;
        for(int index=1; index<=5; index++){
            if (counter[largest] < counter[index]){
                largest=index;
            }
        }

        return largest;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);

        System.out.println(String.valueOf(result));

        bufferedReader.close();
    }
}
