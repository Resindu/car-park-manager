package vehicles;

class vehicle {
	
    private int ID_plate_no;
	private String vehicle_brand; 
	private String name;

	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	
	
	}
	public int getID_plate_no() {
		return ID_plate_no;
	}
	public void setID_plate_no(int iD_plate_no) {
		ID_plate_no = iD_plate_no;
	}
	public String getVehicle_brand() {
		return vehicle_brand;
	}
	public void setVehicle_brand(String vehicle_brand) {
		this.vehicle_brand = vehicle_brand;
	}
	public vehicle(int iD_plate_no,String vehicle_brand, String name) {
		super();
		
		this.ID_plate_no = iD_plate_no;
		this.vehicle_brand = vehicle_brand;
		this.name=name;
	}
		
}





	

