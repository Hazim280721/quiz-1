
public class main {
	public static void main(String[] args) {
		aeroplane boeing = new aeroplane();
		
		boeing.setSpec();
		
		boeing.Storage();
		boeing.Fly();
		
		System.out.println();
		
        aeroplane airbus = new aeroplane();
		
        airbus.setSpec();
       
		airbus.Storage();
		airbus.Fly();
	}


}
