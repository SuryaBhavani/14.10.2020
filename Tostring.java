/*it provide string representation of object
 * The default toString() method for class Object returns a string consisting of the name of the class of which the object is an instance, the at-sign character `@’, and the unsigned hexadecimal representation of the hash code of the object.
 *we can also override it
 *they are present in the java.lang package
 *it is a default package and we need not import it 
 *java compiler imports java.lang package internally by default. It provides the fundamental classes that are necessary to design a basic Java program. 
 *
 */
public class Tostring {
	public static void main(String []args) {
		Tostring obj1=new Tostring();
		Demo obj2=new Demo(); 
		System.out.println(obj1);//displays default string with classname@hashcode
		System.out.println(obj2);
	}

}
class Demo{
	public String toString() {
		return "THe default toString can be overrided";
	}
}