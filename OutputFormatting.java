import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                // if you want 15 chars of string, type 14
                String outputString = String.format("%-14s %d", s1,x);
                System.out.println(outputString);
            }
            System.out.println("================================");

    }
}



