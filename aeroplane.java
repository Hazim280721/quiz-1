import java.util.Scanner;
public class aeroplane {
String model;
String color;
int seat;
int speed;

Scanner s=new Scanner(System.in);

public void setModel() {
	System.out.println("Enter models: ");
	this.model=s.nextLine();
}
	public void setColor() {
	System.out.println("Enter color: ");
	this.color=s.nextLine();
	}
	public void setSeat() {
    System.out.println("Enter seat: ");	
	this.seat=s.nextInt();
	}
	public void setSpeed() {
    System.out.println("Enter speed: ");	
	this.speed=s.nextInt();
	
	
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
