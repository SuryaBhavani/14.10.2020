/*interthread communication means communication between threa
 * 2 threads can communicate with each other using wait(),notify()and notify all()methods
 * the T which expect updation call wait ()and enter to waiting state
 * the T which is responsible for updation after updation it will be responsible to call the notify method 
 * then wating thread will get nitification and continue its excecution with those updated items
 * These methods are present in object class because thread can call these methods on any java objects So to accessessable we keep these methods in object class but not thread class.
 * the tread to call wait ()or any 2 other methods on any obj,itshould be the owner of the obj i.e the thread should have lock of the obj i.e the thread should be
 * inside Synchronized area
 *hence,we can call all these methods on from Synchronized area or else will throw illegalMonitorStateException 
 * If a thread calls wait () of any obj ,it should immediately releases thelock of that particular obj before entering into waiting state
 * if a thread calls notify method on any obj it relaeases the lock of obj but not immediately
 * except these 3 ,there is no other method where thread releases lock
 * public final void wait()throws InterruptedException
 * public final native void wait(long ms)throws InterruptedException;here waiting time is specified
 * public final void wait(long ms,int ns)throws InterruptedException;specifies waiting time with exact nano seconds
 * public final native void notify()
 * public final native void notifyAll()
 * every wait method throws interrupted exception which is checked exception so we should handle this exception while using wait method either by try catch or by throws keyword or else we will get compiletime error
 * 
 * 
 */
public class ThreadDemo {
	public static void main(String []args)throws InterruptedException 
	{
		ThreadA a=new ThreadA();
		a.start();
		synchronized(a) {
			a.wait();
		}
		System.out.println(a.total);
	}

}
class ThreadA extends Thread{
	int total=0;
	public void run() {
		synchronized (this) {
		for (int i=1;i<=100;i++) {
			total=total+i;
		}
		this.notify();
		this.notifyAll();
		}
		
	}
}
