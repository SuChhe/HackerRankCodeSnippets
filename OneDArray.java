import java.util.*;

public class OneDArray {

    public static boolean canWin(int leap, int[] game) {
        if (leap <1)
            return false;
        int i =0;
        for (i=0; i<game.length-leap; i++ ){
        	if (game[i]==0 && game[i+leap]==0) {
        		return true;
        	}
        }
        return false;
        // Return true if you can win the game; otherwise, return false.
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}