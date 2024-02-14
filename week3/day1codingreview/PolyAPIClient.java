package week3.day1codingreview;

public class PolyAPIClient {

	public void sendRequest(String endpoint) {
		System.out.println("Print endpoint:"+endpoint);
		
	}
	public void sendRequest(String endpoint , String requestBody , String requestStatus) {
		System.out.println("Print endpoint:"+endpoint+" Print requestBody:"+requestBody+" Print requestStatus:"+requestStatus);
	}
	public static void main(String[] args) {
		PolyAPIClient api =new PolyAPIClient();
		api.sendRequest("12.43");
		api.sendRequest("12.43", "class name obj method ", "Active");
		

	}

}
