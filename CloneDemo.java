
public class CloneDemo implements Cloneable  {
	int roll;
	String name;

CloneDemo(int roll,String name){
	this.roll=roll;
	this.name=name;
}
//we need to cretae clonable interfaces obj clone or else it will throw "CloneNotSupportedException"
public Object clone()throws CloneNotSupportedException{
	return super.clone();//to obtain clone object reference
	
}
public static void main(String[]args) {
	try {
		CloneDemo c1=new CloneDemo(401,"SuryaBhavani");
		CloneDemo c2=(CloneDemo)c1.clone();
		System.out.println(c1.roll+" "+c1.name);  
		System.out.println(c2.roll+" "+c2.name);  
	}catch(CloneNotSupportedException s) {}
}
}