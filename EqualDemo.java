/*it is a method of Integer class in java.lang package
 * This method compares the value of the parameter to the value of the current Integer object
 * It returns Boolean 
 * Syntax:public Boolean equals(Object obj)
 */
public class EqualDemo {
	public static void main(String[]args) {
		Integer obj1=new Integer (43);
		Integer obj2=new Integer (43);
		String obj3=new String("surya");
		String obj4=new String("surya  ");
		Float obj5=new Float(22.2f);
		Double obj6=new Double(22.2d);
		
		System.out.println(obj1.equals(obj2));//it will compare the value of parameters of current objects
		System.out.println(obj3.equals(obj4));
		System.out.println(obj5.equals(obj6));
		System.out.println(obj1== obj2);//here it check obj1 and obj2 refer to same object
		
	}

}
