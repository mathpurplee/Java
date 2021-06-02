package example;

public class Car {
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;
	
	Car() {}
	
	Car(String model) {
		this(model, null, 0);
	}
	
	Car(String model, String color) {
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
