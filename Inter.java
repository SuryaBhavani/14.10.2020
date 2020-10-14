
public interface Inter {
	int num1=10,num2=30;
	
	void display();
	private void welcome() {
		System.out.println("Hello all");
	}
	
public interface inter1 extends Inter{
	public int sum();
}


class Try implements inter1{
	public void display() {
		System.out.println("hai");
	}
	public int sum() {
		int n1=10; 
		int n2=20;
		return n1+n2;
	}
	
	public static void main(String [] args) {
		Try obj=new Try();
		
		obj.display();
		System.out.println(obj.sum());
		
		
	}
}

	}