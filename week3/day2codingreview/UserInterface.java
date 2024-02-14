package week3.day2codingreview;

public class UserInterface extends FrontEndConnection {

	

	@Override
	public void edit() {
		System.out.println("Front End is edited");
		
		
	}
	public static void main(String[] args) {
		UserInterface ui =new UserInterface();
		ui.edit();
		ui.delete();
		ui.connect();
		ui.disconnect();
		ui.executeUpdate();
		
	}
}

