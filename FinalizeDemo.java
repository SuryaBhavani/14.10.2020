/*It is a method that the Garbage Collector always calls just before the deletion/
 * destroying the object which is eligible for Garbage Collection
 *Finalize method will perform the cleanup activities
 *like closing the resources associated with that object like Database Connection, Network Connection or we can say resource de-allocation.
 *once finalize method completes the GC will destroy the object
 *
 */
public class FinalizeDemo {
	public static void main(String[]args) {
		String s=new String("Surya");
		FinalizeDemo obj=new FinalizeDemo();
		//obj.finalize();
		obj=null;
		s=null;
		System.gc();
		System.out.println("Main Complete");//the gc will call the finalize method of obj which is eligible for gc but not our class finalize method
		
		
	}
	public void finalize() {
		System.out.println("we can access our class finalize method only by defining the obj of the main class");
		System.out.println(10/0);
	}

}
