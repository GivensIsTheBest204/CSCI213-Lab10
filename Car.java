public class Car extends Vehicle{
	private int doors;
	private int passengers;
	
	public Car(String aMake, String aModel, String aPlate,int thedoors, int thepassengers) {
		super(aMake,aModel,aPlate);
		this.doors = thedoors;
		this.passengers = thepassengers;
	}
	
	/**
	 * getter for doors
	 * @return the doors as a int
	 */
	public int getDoors(){
		return this.doors;
	}
	
	/**
	 * getter for passengers
	 * @return the passengers as a int
	 */
	public int getPassengers(){
		return this.passengers;
	}
	
	public String toString(){
		return String.format("%d-door %s %s with license %s.",this.doors,this.getMake(),this.getModel(),this.getPlate());
	}
	@Override
	public boolean equals(Object obj){
		if(! (obj instanceof Car))
			return false;
		Car other = (Car) obj;
		return this.doors == other.getDoors() && this.passengers == other.getPassengers() &&
		super.equals(other);
	}
	
	public Car copy(){
		return new Car(this.getMake(),this.getModel(),this.getPlate(),this.doors,this.passengers);
	}
}
