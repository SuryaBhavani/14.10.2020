/*
 * For every object, JVM generates a unique number which is hashcode.
 *  It convert the internal address of object to an integer
 *  Use of hashCode() method : Returns a hash value that is used to search object in a collection.
 *  A collection is a group of individual objects which are represented as a single unit.
*  The main advantage of saving objects based on hash code is that searching becomes easy.
*  We can over ride this hash method
 */  
 
public class HashCode {
	public static void main(String [] args) {
		HashCode obj1=new HashCode();
		HashCode obj2=new HashCode();
		Student obj3=new Student(1);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
	}

} class Student{
	int roll;
	Student(int roll){
		this.roll=roll;
	}
	public int hashCode() {
		return roll;
	}
}