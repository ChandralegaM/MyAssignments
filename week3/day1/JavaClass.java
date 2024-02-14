package week3.day1;

public class JavaClass {
	
	public void readjava(String message , String status ) {
		System.out.println("print message:"+message+"print status:"+status);

	}
	public void readjava(String message , String status , boolean snap ) {
		System.out.println("print message:"+message+"print status:"+status+"print snap:"+snap);

	}
	public static void main(String[] args) {
	JavaClass jc =new JavaClass();
	jc.readjava("read", "yes");
	jc.readjava("read", "yes", true);
}
}

