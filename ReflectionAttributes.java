import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;


/** 
 * JAVA reflection is a very powerful tool to inspect the attributes of a 
 * class in runtime. For example, we can retrieve the list of public fields 
 * of a class using getDeclaredMethods().
 * 
 * https://docs.oracle.com/javase/tutorial/reflect/class/classMembers.html
 * getDeclaredMethods gets list of all declared methods
 * method.getName gets only name part of all methods
 * 
 * @author sumitchheda
 *
 */

public class ReflectionAttributes {

        public static void main(String[] args){
            Class student = new CountingInversions().getClass();
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method method:methods){
                methodList.add(method.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }