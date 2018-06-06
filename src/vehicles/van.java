package vehicles;

class van extends vehicle{
	private int cargo_length;
	private int cargo_width;
	private int cargo_height;
	
	public van(int iD_plate_no, String vehicle_brand, String name,
			int cargo_length, int cargo_width, int cargo_height) {
		super(iD_plate_no, vehicle_brand, name);
		this.cargo_length = cargo_length;
		this.cargo_width = cargo_width;
		this.cargo_height = cargo_height;
		
	}

	
	
	public int getCargo_length() {
		return cargo_length;
	}

	public void setCargo_length(int cargo_length) {
		this.cargo_length = cargo_length;
	}

	public int getCargo_width() {
		return cargo_width;
	}

	public void setCargo_width(int cargo_width) {
		this.cargo_width = cargo_width;
	}

	public int getCargo_height() {
		return cargo_height;
	}
	public void setCargo_height(int cargo_height) {
		this.cargo_height = cargo_height;
	}

		
	
	
	
}
