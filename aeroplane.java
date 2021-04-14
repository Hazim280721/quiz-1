import java.util.Scanner;
public class aeroplane {
String model;
String color;
int seat;
int speed;

Scanner s=new Scanner(System.in);

public void setSpec() {
	System.out.println("Enter model, color, seats, speed: ");
	this.model=s.nextLine();
	this.color=s.nextLine();
	this.seat=s.nextInt();
	this.speed=s.nextInt();
	
	System.out.println("Model :"+model);
	System.out.println("Color :"+color);
	System.out.println("Seats :"+seat);
	System.out.println("Speed :"+speed+" Kn");
}



public String getModel() {
	  return this.model;
}

public String getColor() {
	  return this.color;
 }

public int getSeat() {
	  return this.seat;
}
public int getSpeed() {
	  return this.speed;
}


public void Storage() {
	System.out.println("The aeroplane can storage");
}
public void Fly() {
	System.out.println("The aeroplane can fly long range");
}
}
