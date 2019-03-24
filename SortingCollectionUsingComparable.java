import java.math.BigInteger;
import java.util.*;

class Student1 implements Comparable<Student1>{
	private int id;
	private String fname;
	private double cgpa;
	public Student1(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	
	public String toString() {
		return this.fname + " " + this.cgpa + " " + this.id;
	}
    
    @Override
    public int compareTo(Student1 s) {
        if (this.cgpa == s.cgpa) {
        	if (this.fname.equals(s.fname)) {
        		return this.id - s.id;
        	} else {
        		return this.fname.compareTo(s.fname);
        	}
        } else {
            return s.cgpa > this.cgpa?1:-1;
        }
    }
}

//Complete the code
public class SortingCollectionUsingComparable
{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student1> studentList = new ArrayList<Student1>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student1 st = new Student1(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
	
      
		}
		Collections.sort(studentList);
        //for(int i = 0; i<studentList.size(); i++){
        //  System.out.println(studentList.get(i).getFname());
		for(Student1 st1: studentList){
            System.out.println(st1.getFname());
        }
        in.close();
    }
}



