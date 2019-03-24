import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			int indexStartTagStart=0;
			String line = in.nextLine();
			boolean found=false;
			while(indexStartTagStart<line.length() && line.indexOf('<', indexStartTagStart)>=0) {
				indexStartTagStart=line.indexOf('<',indexStartTagStart);
				int indexStartTagEnd=line.indexOf('>',indexStartTagStart);
				String openTag="";
				if (indexStartTagStart>=0 && indexStartTagEnd >=0) {
					openTag=line.substring(indexStartTagStart+1, indexStartTagEnd);
				}
				int indexEndTagStart=0;
				int indexEndTagEnd=0;
				indexEndTagStart=line.indexOf('<',indexStartTagEnd);
				indexEndTagEnd=line.indexOf('>',indexEndTagStart);
				String closeTag="";
				if (indexEndTagStart>=0 && indexEndTagEnd >=0 && (indexEndTagStart+2) < line.length()) {
					closeTag=line.substring(indexEndTagStart+2, indexEndTagEnd);
				}
				if (!openTag.equals("")&&(!closeTag.equals("")&&openTag.equals(closeTag))) {
					String content=line.substring(indexStartTagEnd+1,indexEndTagStart);
					if (!content.equals("")) {
						found=true;
						System.out.println(content);
					}
				}
				indexStartTagStart++;
			}
			if (!found) {
				System.out.println("None");
			}
			
          	//Write your code here
			
			testCases--;
		}
	}
}



