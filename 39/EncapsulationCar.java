
public class EncapsulationCar {

	private String make;
	private String model;
	private int year;
	
	/* constructor before defining getters and setters
	 * 
	EncapsulationCar(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	*/
	
	// constructor after defining getters and setters
	
	EncapsulationCar(String make, String model, int year) {
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	// getters
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	// setters
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}
