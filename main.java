
public class main {
	public static void main(String[] args) {
		
		aeroplane boeing = new aeroplane();
		
		boeing.setModel();
		boeing.setColor();
		boeing.setSeat();
		boeing.setSpeed();
		boeing.Storage();
		boeing.Fly();
		
		System.out.println("Model :"+boeing.getModel());
		System.out.println("Color :"+boeing.getColor());
		System.out.println("Seats :"+boeing.getSeat());
		System.out.println("Speed :"+boeing.getSpeed()+" Kn");
		System.out.println();
		
        aeroplane airbus = new aeroplane();
        airbus.setModel();
        airbus.setColor();
        airbus.setSeat();
        airbus.setSpeed();
        airbus.Storage();
        airbus.Fly();
        airbus.Storage();
		airbus.Fly();
		
		System.out.println("Model :"+airbus.getModel());
		System.out.println("Color :"+airbus.getColor());
		System.out.println("Seats :"+airbus.getSeat());
		System.out.println("Speed :"+airbus.getSpeed()+" Kn");
		System.out.println();
	}


}
