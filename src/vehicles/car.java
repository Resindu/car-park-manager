package vehicles;

class car extends vehicle{
	
	private int no_of_doors;
	private String colour;


	

//constructor
public car(int iD_plate_no, String vehicle_brand, int no_of_doors,String name,
			 String colour) {
		super(iD_plate_no, vehicle_brand, name);
		this.no_of_doors = no_of_doors;
		this.colour = colour;
		
	}


//getting getters and setters

public int getNo_of_doors() {
	return no_of_doors;
}
public void setNo_of_doors(int no_of_doors) {
	this.no_of_doors = no_of_doors;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}

}