package task29April;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	
	@Autowired
	private Carengine engine;
	
	@Autowired
	private CarBrakes brakes;
	
	@Autowired
    private CarGear  gear;
	public Car(Carengine engine, CarBrakes brakes, CarGear gear) {
		super();
		this.engine = engine;
		this.brakes = brakes;
		this.gear = gear;
	}
	public Carengine getEngine() {
		return engine;
	}
	public void setEngine(Carengine engine) {
		this.engine = engine;
	}
	public CarBrakes getBrakes() {
		return brakes;
	}
	public void setBrakes(CarBrakes brakes) {
		this.brakes = brakes;
	}
	public CarGear getGear() {
		return gear;
	}
	public void setGear(CarGear gear) {
		this.gear = gear;
	}
	
	
}
