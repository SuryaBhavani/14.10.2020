/*This method returns the runtime class of the object
 * Syntax:public final Class <?>=getClass()
 * Object is the root class and the others are extended from it
 */

public class GetClass {
	public static void main(String[]args) {
		Object obj=new String("hai");
		Object obj2=new Integer(10);
		GetClass obj1=new GetClass();
		Class a=obj.getClass();//syntax example
		Class b=obj1.getClass();
		Class c=obj2.getClass();
		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(c.getName());
		
	}

}
