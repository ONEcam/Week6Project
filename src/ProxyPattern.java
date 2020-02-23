
public class ProxyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataSheet dataSheet = new ProxySheet("Race_Heat1_Laguna_Seca");
		
		dataSheet.display();
		System.out.println("Please wwait...");
		
		dataSheet.display();
	}

}
