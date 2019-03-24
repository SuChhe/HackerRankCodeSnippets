import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class VerifyChessBoard {


    // Complete the solve function below.
    static String solve(List<List<Integer>> board) {
        int prevCell = 0;
        boolean firstCell = true;
        for (List<Integer>row : board) {
            for (int i = 0 ;i<row.size(); i++) {
                int currentCell = 0;
                if (firstCell) {
                    prevCell = (int)row.get(i);
                    firstCell=false;
                } else {
                    currentCell = row.get(i);
                    if (currentCell == prevCell) {
                        return "No";
                    } else {
                        prevCell = currentCell;
                    }
                }
            }
            if( row.size()%2==0) {
                prevCell = row.get(row.size()-2);
            }
        }
        return "Yes";

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<List<Integer>> board = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] boardRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                List<Integer> boardRowItems = new ArrayList<>();

                for (int j = 0; j < n; j++) {
                    int boardItem = Integer.parseInt(boardRowTempItems[j]);
                    boardRowItems.add(boardItem);
                }

                board.add(boardRowItems);
            }

            String result = solve(board);

            System.out.println(result);
            
        }

        bufferedReader.close();
    }
}
