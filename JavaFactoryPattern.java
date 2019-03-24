import java.util.*;
import java.security.*;

/**
 * 
 * According to Wikipedia, a factory is simply an object that returns another 
 * object from some other method call, which is assumed to be "new".
 * 
 * In this problem, you are given an interface Food. There are two classes 
 * Pizza and Cake which implement the Food interface, and they both contain 
 * a method getType().
 * 
 * The main function in the Main class creates an instance of the FoodFactory 
 * class. The FoodFactory class contains a method getFood(String) that returns 
 * a new instance of Pizza or Cake according to its parameter.
 * @author sumitchheda
 *
 */
interface Food {
	 public String getType();
	}
	class Pizza implements Food {
	 public String getType() {
	 return "Someone ordered a Fast Food!";
	 }
	}

	class Cake implements Food {

	 public String getType() {
	 return "Someone ordered a Dessert!";
	 }
	}
	class FoodFactory {
		public Food getFood(String order) {
			//Write your code here
	        Food returnFood=null;
	        if (order.equalsIgnoreCase("Cake")) {
	            returnFood= new Cake();
	        }
	        else if (order.equalsIgnoreCase("Pizza")) {
	            returnFood= new Pizza();
	        } 
	        return returnFood;
	        
		}//End of getFood method

	}//End of factory class

	public class JavaFactoryPattern {

	 public static void main(String args[]){
			Do_Not_Terminate.forbidExit();

		try{

			Scanner sc=new Scanner(System.in);
			//creating the factory
			FoodFactory foodFactory = new FoodFactory();
	
			//factory instantiates an object
			Food food = foodFactory.getFood(sc.nextLine());
	
			
			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	 }

	}
	class Do_Not_Terminate {
		 
	    public static class ExitTrappedException extends SecurityException {

			private static final long serialVersionUID = 1L;
	    }
	 
	    public static void forbidExit() {
	        final SecurityManager securityManager = new SecurityManager() {
	            @Override
	            public void checkPermission(Permission permission) {
	                if (permission.getName().contains("exitVM")) {
	                    throw new ExitTrappedException();
	                }
	            }
	        };
	        System.setSecurityManager(securityManager);
	    }
	}	
		



