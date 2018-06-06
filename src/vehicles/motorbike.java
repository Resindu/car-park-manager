package vehicles;

public class motorbike extends vehicle{
	private int engine_size;
	

	

		
		public motorbike(int iD_plate_no,String vehicle_brand,String name, int engine_size) {
		super(iD_plate_no, vehicle_brand,name);
		this.engine_size = engine_size;
	}

		public int getEngine_size() {
			return engine_size;
		}

		public void setEngine_size(int engine_size) {
			this.engine_size = engine_size;
		}

		
	}
