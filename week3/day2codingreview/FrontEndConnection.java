package week3.day2codingreview;

public abstract class FrontEndConnection implements DatabaseConnection{
	public abstract void edit();
	{
		System.out.println("Front End is sedited");
		
		
	}
	public void delete() {
		System.out.println("Front End is deleted");
	}
	public void connect() {
		System.out.println("Back End is connected");
	}
	public void disconnect() {
		System.out.println("Back End is disconnected");
	}
	public void executeUpdate() {
		System.out.println("Back End is executeUpdated");
	}
}
